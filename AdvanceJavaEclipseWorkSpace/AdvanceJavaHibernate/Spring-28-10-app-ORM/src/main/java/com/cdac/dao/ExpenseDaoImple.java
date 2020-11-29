package com.cdac.dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Expense;
import com.mysql.cj.Session;

@Repository
public class ExpenseDaoImple implements ExpenseDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public ExpenseDaoImple() {
		
	}

	public void insertExpense(final Expense expense) {
		
		hibernateTemplate.execute( new HibernateCallback<Void>(){

			public Void doInHibernate(org.hibernate.Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(expense);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		

	}

	public void deleteExpense(final int expenseId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			public Void doInHibernate(org.hibernate.Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Expense expense = new Expense(expenseId);
				session.delete(expense);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});

	}

	public Expense selectExpense(final int expenseId) {
		Expense exp = hibernateTemplate.execute(new HibernateCallback<Expense>() {

			public Expense doInHibernate(org.hibernate.Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Expense expense = (Expense)session.get(Expense.class, expenseId);
				tr.commit();
				session.flush();
				session.close();
				return expense;
			}
			
		});
		return exp;
	}

	public void updateExpense(final Expense expense) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			public Void doInHibernate(org.hibernate.Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(expense); 
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	public List<Expense> selectAll() {
		
		List<Expense> list = hibernateTemplate.execute(new HibernateCallback<List<Expense>>() {

			public List<Expense> doInHibernate(org.hibernate.Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Expense");
				List<Expense> li = q.list();
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return list;
	}
}

package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Expense;

@Repository
public class ExpenseDaoImple implements ExpenseDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	@Override
	public void insertExpense(Expense expense) {
			
			hibernateTemplate.execute(new HibernateCallback<Expense>() {

				@Override
				public Expense doInHibernate(Session session) throws HibernateException {
					Transaction tr = session.beginTransaction();
					session.save(expense);
					tr.commit();
					session.flush();
					session.close();
					return null;
				}
			});

	}

	@Override
	public void deleteExpense(int expenseId) {
		Expense expense = new Expense();
		expense.setExpenseId(expenseId);
		
		hibernateTemplate.execute(new HibernateCallback<Integer>() {

			@Override
			public Integer doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(expense);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	

	}

	@Override
	public Expense selectExpense(int expenseId) {
		
		Expense expense = hibernateTemplate.execute(new HibernateCallback<Expense>() {

			@Override
			public Expense doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from expense where expense_id = ? ");
				q.setInteger(0, expenseId);
				List<Expense> li = q.list();
				if(li.isEmpty()) {
					return null;
				}
				return li.get(0);
			}
		});
		
		return expense;
	}

	@Override
	public void updateExpense(Expense expense) {
		hibernateTemplate.execute(new HibernateCallback<Expense>() {

			@Override
			public Expense doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(expense);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});

	}

	@Override
	public List<Expense> selectAll() {
		
		List<Expense> li = hibernateTemplate.execute(new HibernateCallback<List<Expense>>() {

			@Override
			public List<Expense> doInHibernate(Session session) throws HibernateException {
				
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Expense");
				
				List<Expense> l = q.list();
				
				tr.commit();
				session.flush();
				session.close();
				return l;
			}
		});

		return li;
	}

}

package com.cdac.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dao.UserDao;
import com.cdac.dto.User;

@Repository
public class UserDaoImple implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Override
	public void insert(User user) {
		
		hibernateTemplate.execute(new HibernateCallback<User>(){

			@Override
			public User doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(user);
				tr.commit();
				session.flush();
				session.close();
				return null;
				
			}
			
		});

	}


	

}

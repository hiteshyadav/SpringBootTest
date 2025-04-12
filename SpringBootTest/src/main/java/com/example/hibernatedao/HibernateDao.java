package com.example.hibernatedao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.USERS;

@Repository
public class HibernateDao {

	@Autowired
	SessionFactory sessionFact;
	
	
	public USERS getUser(int id) {
		Session session=sessionFact.openSession();
		USERS u1=session.load(USERS.class, id);
		return u1;
	}
	
	public USERS getUser(String name) {
		Session session=sessionFact.openSession();
		String qry="FROM USERS where name = :name";
		Query q=session.createQuery(qry);
		q.setParameter("name", name);
		USERS u1=(USERS) q.uniqueResult();
		System.out.println(" User : " + u1);
		
		return u1;
	}
	
	public void addUser(USERS u1) {
		Session session=sessionFact.openSession();
		session.beginTransaction();
		session.saveOrUpdate(u1);
		session.getTransaction().commit();		
	}
}

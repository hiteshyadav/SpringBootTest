package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.USERS;
import com.example.hibernatedao.HibernateDao;

import jakarta.transaction.Transactional;

@Service
public class HibernateService {

	HibernateDao dao;
	
	public HibernateService(HibernateDao dao) {
		this.dao=dao;
	}
	
	public void testSession() {
		this.method_01();
		this.method_02();
	}
	
//	@org.springframework.transaction.annotation.Transactional
	public void method_01() {
		try {
			USERS u1=new USERS();
//			u1.setId(25);
			u1.setName("25thUser");
			u1.setStatus(1);
			
			dao.addUser(u1);
			
//			USERS u2=dao.getUser("25thUser");
//			System.out.println(" user_25 : " + u2);

		}catch(Exception e) {
			System.out.println(" Exception1 : "+ e);
			e.printStackTrace();
		}
	}
	
	public void method_001() {
		try {
			USERS u1=new USERS();
			u1.setId(25);
			u1.setName("25thUser");
			u1.setStatus(1);
			
			dao.addUser(u1);
		}catch(Exception e) {
			System.out.println(" Exception1 : "+ e);
			e.printStackTrace();
		}

	}
	
//	@org.springframework.transaction.annotation.Transactional
	public void method_02() {
		try {
			USERS u1=dao.getUser("25thUser");
			System.out.println(" user_25 : " + u1);

		}catch(Exception e) {
			System.out.println(" Exception1 : "+ e);
			e.printStackTrace();
		}
	}
}

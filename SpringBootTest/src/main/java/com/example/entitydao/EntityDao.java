package com.example.entitydao;

import org.springframework.stereotype.Repository;

import com.example.entity.USERS;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EntityDao {

	@PersistenceContext
	EntityManager entityManager;

	public USERS getUser(int id) {
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
		USERS u1 = entityManager.find(USERS.class, 1);
		return u1;
	}
}

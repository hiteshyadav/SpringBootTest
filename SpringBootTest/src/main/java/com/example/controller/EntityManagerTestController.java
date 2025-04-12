package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.USERS;
import com.example.entitydao.EntityDao;

@RestController
public class EntityManagerTestController {

	EntityDao dao;

	public EntityManagerTestController(EntityDao dao) {
		this.dao = dao;
	}

	@GetMapping("/euser")
	public ResponseEntity<USERS> getUserByEm(@RequestParam int id) {
		USERS u1 = dao.getUser(id);
		return new ResponseEntity<>(u1, HttpStatus.OK);
	}
}

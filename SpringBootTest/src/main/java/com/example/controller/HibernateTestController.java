package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.USERS;
import com.example.hibernatedao.HibernateDao;
import com.example.service.HibernateService;

@RestController
public class HibernateTestController {

	private HibernateDao hdao;
	private HibernateService service;

	public HibernateTestController(HibernateDao hdao,HibernateService service) {
		this.hdao = hdao;
		this.service=service;
	}

	@GetMapping("/huser")
	public ResponseEntity<USERS> getUser(@RequestParam int id) {
		USERS u1=hdao.getUser(id);
		return new ResponseEntity<>(u1, HttpStatus.OK);
	}
	
	@GetMapping("/tuser")
	public ResponseEntity testSession() {
		service.testSession();
		return new ResponseEntity<>( HttpStatus.OK);
	}
}

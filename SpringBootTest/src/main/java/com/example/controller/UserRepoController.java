package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserRepoService;

@RestController
public class UserRepoController {

	UserRepoService service;

	public UserRepoController(UserRepoService service) {
		this.service = service;
	}

	@GetMapping("/ruser")
	public void getUser(@RequestParam int id) {
		service.testUser();
	}
}

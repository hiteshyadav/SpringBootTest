
package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.User;
import com.example.entity.USERS;
import com.example.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<USERS> getUser(@PathVariable int id) {
		return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
	}

	@PostMapping("/user")
	public ResponseEntity putUser(@RequestBody User user) {
		System.out.println(" User : " + user);
		
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
}

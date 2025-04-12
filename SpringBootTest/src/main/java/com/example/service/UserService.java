package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.User;
import com.example.entity.USERS;
import com.example.repo.UserDto;

@Service
public class UserService {

	private UserDto dto;

	public UserService(UserDto dto) {
		this.dto = dto;
	}

	public USERS getUser(Integer id) {
		return dto.findById(id).get();
	}
	

	public List<USERS> getAllUser() {
		
		return dto.findAll();
	}
	public void putUser(User user) {
		USERS users = new USERS();
		users.setName(user.getName());
		users.setStatus(user.getStatus());
//		users.setId(user.getId());

		System.out.println(" USERS : " + users);
		dto.save(users);
	}
}

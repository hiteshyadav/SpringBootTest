package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.USERS;
import com.example.repo.UserDto;

@Service
public class UserRepoService {

	UserDto repo;
	
	public UserRepoService(UserDto repo) {
		this.repo=repo;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void testUser() {
		addUser();
		delUser();
		List<USERS> res=getUser("25thUser");
		for(USERS u1:res) {
			System.out.println(" User res : "+u1); 
		}
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public void addUser() {
		USERS u1=new USERS();
		u1.setName("25thUser");
		u1.setStatus(1);
		repo.save(u1);
	}
	public void delUser() {
		repo.deleteById(35);
	}
	public List<USERS> getUser(String name) {
		return repo.findByName(name);
	}
	public USERS getUser(int id) {
		
		
		return repo.getById(id);
	}
}

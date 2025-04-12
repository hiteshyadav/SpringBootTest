package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.USERS;

@Repository
public interface UserDto extends JpaRepository<USERS, Integer> {
	
	public List<USERS> findByName(String name);
}

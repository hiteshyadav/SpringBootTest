package com.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.example.entity.USERS;

/*
 * In this case, entire spring application context will be loaded.
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserServiceTest {

	@Autowired
	UserService userService;

	@Test
	public void getUserTest() {
		assertNotNull(userService);

	}

	@Test
	public void getUserByIdTest() {
		USERS u = userService.getUser(1);
		assertEquals(u.getName(), "USA", "Get user by Id is not working");
	}

	@Test
	public void getAllUserTest() {
		List<USERS> users = userService.getAllUser();
		for (USERS u : users) {
			System.out.println(" Users : " + u);
		}
		assertNotNull(users, "User srevice is not able to fetch all Entity ");

	}
}

package com.example.value;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserDetailsTest {

	@Test
	public void testUser() {
		UserDetails u1 = new UserDetails("yadav");
		UserDetails u2 = new UserDetails("yadav");
		
		boolean res = u1.equals(u2);
		
		assertTrue(res,"Value Object is not working properly");
	}
}

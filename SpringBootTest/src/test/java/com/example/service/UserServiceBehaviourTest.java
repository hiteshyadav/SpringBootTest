package com.example.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.repo.UserDto;

public class UserServiceBehaviourTest {

	@Test
	public void getAllUserTest() {
		UserDto mockDto = Mockito.mock(UserDto.class);
		UserService service = new UserService(mockDto);
		
		service.getAllUser();
		
		// behaviour testing like findall method is called or not;
		verify(mockDto,times(1)).findAll();
	}
}

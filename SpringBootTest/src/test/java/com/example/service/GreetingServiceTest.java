package com.example.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GreetingServiceTest {

	@Test
	public void testGrret() {
		GreetingService service = Mockito.mock(GreetingService.class);

		assertNotNull(service);
	}
}

package com.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.repo.UserDto;

/*
 * In this case, only web layer will be loaded.
 * Rest controller can be auto wired but dto object can not be auto wired.
 */
@WebMvcTest(FirstController.class)
public class WebLayerTest {

	@Autowired
	private MockMvc mockMvc;

//	@Autowired
//	UserDto dto;
	
	@Autowired
	FirstController controller;
	
	@Test
	public void testController() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string("Hello World"));
		;
	}
}

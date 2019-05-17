 package com.capgemini.spring.test.testcontroller.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.capgemini.spring.test.testcontroller.HelloResources;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloResourcesTest {

	private MockMvc mockMvc;
	@InjectMocks
	private HelloResources helloResource;
	
	@Before
	public void setUp() {
		
		mockMvc = MockMvcBuilders.standaloneSetup(helloResource).build();
	}
	

	@Test
	public void testHelloWorld() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/hello")
				).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("hello World"));
	}
 }

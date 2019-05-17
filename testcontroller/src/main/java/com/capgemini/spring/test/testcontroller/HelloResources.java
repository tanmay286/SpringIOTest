package com.capgemini.spring.test.testcontroller;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResources {
	
	@GetMapping
	public String helloWorld() {
		return "hello World";
	}
	
	@GetMapping(value = "/json")          // Not Completed
	public Hello json() {
		return new Hello("Greetings","Smile");
	}
	
	private class Hello {
		
		private String title;
		private String value;
		public Hello(String title, String value) {
			super();
			this.title = title;
			this.value = value;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
		
	}
	

}

package com.capgemini.spring.test.helloworldtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/smile")
public class Controller {
	
	@RequestMapping("/get")
	public String smile() {
		return "smile";
	}

}

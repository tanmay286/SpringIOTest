package com.capgemini.person.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.person.entity.Person;
import com.capgemini.person.service.PersonService;

@RestController
public class myController {

	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public String addPerson() {
		Person person = new Person(1,"John");
		service.addNew(person);
		return "added";
	}
	
	@RequestMapping("/get")
	public Optional<Person> readPerson(){
		Optional<Person> person = service.findProductById(1);
		return person;
	}
}

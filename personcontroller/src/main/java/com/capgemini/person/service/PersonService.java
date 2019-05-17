package com.capgemini.person.service;

import java.util.Optional;

import com.capgemini.person.entity.Person;

public interface PersonService {

	public Person addNew(Person person);

	  boolean updatePerson(Person person); 
	  public Optional<Person> findProductById(int personId); 
	  /*public boolean deletePerson(int personId);
	 */
}

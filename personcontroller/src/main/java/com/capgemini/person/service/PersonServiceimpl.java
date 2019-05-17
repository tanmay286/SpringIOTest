package com.capgemini.person.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.person.dao.PersonDao;
import com.capgemini.person.entity.Person;

@Service
public class PersonServiceimpl implements PersonService{
	
	@Autowired
	private PersonDao personDao;

	@Override
	public Person addNew(Person person) {
		return personDao.save(person);
	}

	@Override
	public boolean updatePerson(Person person) {
		Person per = personDao.save(person);
		if(per!= null)
			return true;
		return false;
	}

	@Override
	public Optional<Person> findProductById(int personId) {
		
		Optional<Person> per = personDao.findById(personId);
		return per;
	}

	
}

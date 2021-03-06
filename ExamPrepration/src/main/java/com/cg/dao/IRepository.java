package com.cg.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.cg.beans.Person;

public interface IRepository {

	Person search(int id);

	Person createNewPerson(Person person);

	List<Person> searchAll();

}
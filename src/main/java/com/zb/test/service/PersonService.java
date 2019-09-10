package com.zb.test.service;

import com.zb.test.entity.Department;
import com.zb.test.entity.Person;

import java.util.List;
import java.util.Map;

public interface PersonService {
    public List<Person> findAll(Map map);
    public Person findById(int id);
    public int update(Person person);
    public List<Department> findD();

}

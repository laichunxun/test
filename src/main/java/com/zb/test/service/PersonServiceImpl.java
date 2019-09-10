package com.zb.test.service;

import com.zb.test.dao.PersonMapper;
import com.zb.test.entity.Department;
import com.zb.test.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper pm;
    @Override
    public List<Person> findAll(Map map) {
        return pm.findAll(map);
    }

    @Override
    public Person findById(int id) {
        return pm.findById(id);
    }

    @Override
    public int update(Person person) {
        return pm.update(person);
    }

    @Override
    public List<Department> findD() {
        return pm.findD();
    }
}

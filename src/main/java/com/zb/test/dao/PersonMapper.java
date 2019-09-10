package com.zb.test.dao;

import com.zb.test.entity.Department;
import com.zb.test.entity.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PersonMapper {
    public List<Person> findAll(Map map);
    public Person findById(int id);
    public int update(Person person);
    public List<Department> findD();
}

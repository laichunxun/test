package com.zb.test.controller;

import com.zb.test.entity.Department;
import com.zb.test.entity.Person;
import com.zb.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PersonController {
    @Autowired
    PersonService ps;
    @RequestMapping("/findAll")
    public String findAll(Person person,Model m){
        Map<String,Object> map=new HashMap<>();
        map.put("person",person);
        List<Person> persons=ps.findAll(map);
        m.addAttribute("person",persons);
        return "list";
    }

    @RequestMapping("/findById")
    public String findById(int id,Model m){
        Map<String,Object> map=new HashMap<>();
        Person person=ps.findById(id);
        List<Department> departments=ps.findD();
        System.out.println(departments);
        map.put("person",person);
        map.put("departments",departments);
        m.addAttribute("map",map);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Person person){
        int count=ps.update(person);
        if(count>0){
            return "redirect:findAll";
        }
        return "findById";
    }
}

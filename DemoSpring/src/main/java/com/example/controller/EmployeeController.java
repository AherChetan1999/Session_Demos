package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmpRepository;
import com.example.model.Employee;
/*@SpringBootApplication(scanBasePackages = {
        "com.example.Employee"
})*/


@RestController
public class EmployeeController {
	@Autowired
	private EmpRepository empry;
	
	
	@PostMapping(value="/add")
    public boolean addEmployee(@RequestBody Employee e1) 
	{
		System.out.println("in addEmp "+e1);
		empry.save(e1);
		return true;
	
    }
	




}

package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Student;


@Controller
public class EmployeeController {
	
	
	@GetMapping(value="/")
    public String hiii() 
	{
		return "index";
	
    }
	
	
	
	@RequestMapping(value="/add" , method = RequestMethod.GET)
    public String add(ModelMap model) 
	{
		 model.addAttribute("Student", new Student());
		return "addStudent";
	
    }
	
 





}

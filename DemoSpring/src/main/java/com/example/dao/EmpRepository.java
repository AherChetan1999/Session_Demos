package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> 
{
	
	
}

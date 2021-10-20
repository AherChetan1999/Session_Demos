package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Brand;
import com.example.services.BrandServiceImp;

@RestController
public class BrandController {
	@Autowired
	private BrandServiceImp brandservice;
	
	@GetMapping(value="/{brandname}")
	public Brand getBrand(@PathVariable String brandname) {
		return brandservice.getBrand(brandname);
	}
}

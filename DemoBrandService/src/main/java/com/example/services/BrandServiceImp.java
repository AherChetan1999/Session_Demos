package com.example.services;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.example.model.Brand;

import antlr.collections.List;

@Service
public class BrandServiceImp implements BrandService{

	List<Brand> brandlist=Arrays.asList(new Brand (1,"Samsung"),
			new Brand(2,"apple"),new Brand(3,"LG"));
	
	public Brand getBrand(String brandname) {
		
		Brand[] brandlist;
		for(Brand b:brandlist) {
			if(b.getBrandname().equalsIgnoreCase(brandname)){
				return b;
				
			}
		}
		return null;
	}
	
}

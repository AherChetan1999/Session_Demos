package com.example.services;

import java.util.Arrays;

import com.example.model.Product;

import antlr.collections.List;

public class ProductServiceImp implements ProductService{
	
	List<Product> brandlist=Arrays.asList(
			new Product (1,"Samsung",45288, 545),
			new Product(2,"apple",6547,55),
			new Product(3,"LG",5478,556));
	
	public List<Product> getProductByid(int id) {
		List<Product> plist= new ArrayList<>();
		for(Product b:plist) {
			if(b.geBrandid==id)){
				plist.add(b);
				
				
			}
		}
		return plist;
	}

	
	
}

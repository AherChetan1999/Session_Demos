package com.example.model;

import java.util.ArrayList;
import java.util.List;


public class Brand {
	
	private int bid;
	private String bname;
	private List<Product> productlist=new ArrayList<>();

		@Override
	public String toString() {
		return "Brand [bid=" + bid + ", bname=" + bname + "]";
	}
		public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public List<Product> getProductlist() {
		return productlist;
	}
	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}
		public Brand(int bid, String bname, List<Product> productlist) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.productlist = productlist;
	}
		public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
		
		
		
}

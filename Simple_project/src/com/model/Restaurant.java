package com.model;

public class Restaurant {
	
	//-Name, opening time, closing time, phone no, address, Cuisine.
	private int res_id;
	private String name;
	private String opening_time;
	private String closing_time;
	private int phone_no;
	private String address;
	private String cuisine;
	private int active;
	
	
	public Restaurant(int res_id, String name, String address , String opening_time, String closing_time, int phone_no, 
			String cuisine, int active) {
		super();
		this.res_id = res_id;
		this.name = name;
		this.opening_time = opening_time;
		this.closing_time = closing_time;
		this.phone_no = phone_no;
		this.address = address;
		this.cuisine = cuisine;
		this.active = active;
	}


	public int getRes_id() {
		return res_id;
	}


	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOpening_time() {
		return opening_time;
	}


	public void setOpening_time(String opening_time) {
		this.opening_time = opening_time;
	}


	public String getClosing_time() {
		return closing_time;
	}


	public void setClosing_time(String closing_time) {
		this.closing_time = closing_time;
	}


	public int getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCuisine() {
		return cuisine;
	}


	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}


	public int isActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "Restaurant [res_id=" + res_id + ", name=" + name + ", opening_time=" + opening_time + ", closing_time="
				+ closing_time + ", phone_no=" + phone_no + ", address=" + address + ", cuisine=" + cuisine
				+ ", active=" + active + "]";
	}
	
	

}


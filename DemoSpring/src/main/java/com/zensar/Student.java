package com.zensar;

public class Student {
	
	private int sid;
	private String name;
	private int per;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", per=" + per + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}

package com.zensar;

public class Batch {
	private int bid;
	private String bname;
	public Batch(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
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
	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + "]";
	}
	
}

package com.book.entity;

public class Book {
	private int bno;
	private String bname;
	private String aname;
	private String btype;
	
	public Book() {
	}
	public Book(int bno,String bname, String aname, String btype) {
		this.bname = bname;
		this.bno = bno;
		this.aname = aname;
		this.btype = btype;
	}
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	
	
}

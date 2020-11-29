package com.cdac.service;

import com.cdac.dao.MyDao;

public class MyService {

	private MyDao md;
	private int no;
	public MyService() {
		System.out.println("consructor called MyService");
	}
	public MyDao getMd() {
		return md;
	}
	
	public void setMd(MyDao md) {
		this.md = md;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void add() {
		System.out.println("Add called Service");
	}
}

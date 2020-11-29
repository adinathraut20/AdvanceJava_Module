package com.cdac.service;

import com.cdac.dao.MyDao;

public class MyService {

	private MyDao md;
	
	public MyService() {
		System.out.println("consructor called MyService");
	}
	public MyService(MyDao md) {
		
		this.md = md;
		System.out.println("parameter constructor called MyService");
	}
	public MyDao getMd() {
		return md;
	}
	
	public void add() {
		System.out.println("Add called Service");
	}
}

package com.cdac.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.cdac.dto.MyBean;

public class MyDao {


	private MyBean m1;
	
	public MyBean getM1() {
		return m1;
	}

	public void setM1(MyBean mb) {
	
		System.out.println("SetMb called MyDao");
		this.m1 = mb;
	}

	public MyDao() {
		System.out.println("Constructor called MyDao");
	}

}

package com.cdac.dao;

import com.cdac.dto.MyBean;

public class MyDao {

	private MyBean mb;
	
	public MyBean getMb() {
		return mb;
	}

	public void setMb(MyBean mb) {
		System.out.println(mb);
		System.out.println("SetMb called MyDao");
		this.mb = mb;
	}

	public MyDao() {
		System.out.println("Constructor called MyDao");
	}

}

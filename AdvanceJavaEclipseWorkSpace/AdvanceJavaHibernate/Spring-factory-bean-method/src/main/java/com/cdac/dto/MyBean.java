package com.cdac.dto;

public class MyBean {
	
	private int beanNo;
	private String beanName;
	
	public int getBeanNo() {
		System.out.println("get Bean No method");
		return beanNo;
	}

	public void setBeanNo(int beanNo) {
		this.beanNo = beanNo;
	}

	public String getBeanName() {
		System.out.println("get Bean Name method");
		return beanName;
		
	}

	public void setBeanName(String beanName) { 
		this.beanName = beanName;
		
	}

	public MyBean() {
		// TODO Auto-generated constructor stub
	}
	public static MyBean getInstance() {
		MyBean mb = new MyBean();
		return mb;
	}

}

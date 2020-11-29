package com.cdac.dto;

public class MyBean {
	
	private int beanNo;
	private String beanName;

	public MyBean() {
		System.out.println("No para constructor called MyBean");
	}

	public MyBean(int beanNo, String beanName) {
		super();
		this.beanNo = beanNo;
		this.beanName = beanName;
		System.out.println("para Constructor called MyBean");
	}

	public int getBeanNo() {
		return beanNo;
	}

	public String getBeanName() {
		return beanName;
	}

}

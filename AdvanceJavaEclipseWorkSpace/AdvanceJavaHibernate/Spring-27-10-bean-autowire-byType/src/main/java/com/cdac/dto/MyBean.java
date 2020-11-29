package com.cdac.dto;

public class MyBean {
	
	private int beanNo;
	private String beanName;
	
	public MyBean() {
		System.out.println("constructor called MyBean");
	}
	
	public int getBeanNo() {
		return beanNo;
	}

	public void setBeanNo(int beanNo) 
	{
		System.out.println("setBeanNo called My Bean");
		this.beanNo = beanNo;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		System.out.println("setBeanName called MyBean");
		this.beanName = beanName;
	}

	

}

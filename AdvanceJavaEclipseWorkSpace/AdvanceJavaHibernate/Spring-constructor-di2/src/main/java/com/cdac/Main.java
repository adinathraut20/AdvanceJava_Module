package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.cdac.service.MyService;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext appC = new ClassPathXmlApplicationContext("cfg.xml");
		MyService m = (MyService) appC.getBean("ms");
		m.add();
		m.getMd().insert();

	}

}

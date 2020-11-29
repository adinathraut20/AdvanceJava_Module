package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dto.MyBean;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext appC = new ClassPathXmlApplicationContext("cfg.xml");
		MyBean m = (MyBean) appC.getBean("mb");
		System.out.println(m.getBeanName()+" "+m.getBeanNo());

	}

}

package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dao.MyDao;
import com.cdac.dto.MyBean;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext appC = new ClassPathXmlApplicationContext("cfg.xml");
		MyDao m = (MyDao) appC.getBean("md");
		System.out.println(m+ "   "+m.getM1()+"    "+m.getM1().getBeanName()+" "+m.getM1().getBeanNo());
		
		MyDao m1 = (MyDao) appC.getBean("md");
		System.out.println(m1+ "   "+m1.getM1()+"    "+m1.getM1().getBeanName()+" "+m1.getM1().getBeanNo());
		
		
	}

}

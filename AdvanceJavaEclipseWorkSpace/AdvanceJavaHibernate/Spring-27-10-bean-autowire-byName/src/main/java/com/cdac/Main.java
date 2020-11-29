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
		ApplicationContext appC1 = new ClassPathXmlApplicationContext("cfg.xml");
		MyDao m = (MyDao) appC1.getBean("md1");
		//System.out.println(m);
		System.out.println(m+ "   "+m.getMb()+"    "+m.getMb().getBeanName()+" "+m.getMb().getBeanNo());
		
		MyDao m1 = (MyDao) appC1.getBean("md1");
		//System.out.println(m1);
		System.out.println(m1+ "   "+m1.getMb()+"    "+m1.getMb().getBeanName()+" "+m1.getMb().getBeanNo());
		
		
	}

}

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
		System.out.println(m+ "   "+m.getBeanName()+" "+m.getBeanNo());
		MyBean m1 = (MyBean) appC.getBean("mb");
		System.out.println(m1+ "   "+m.getBeanName()+" "+m.getBeanNo());
		MyBean m2 = (MyBean) appC.getBean("mb");
		System.out.println(m2+ "   "+ m.getBeanName()+" "+m.getBeanNo());
	}

}

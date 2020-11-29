package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dao.MyDao;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext appC = new ClassPathXmlApplicationContext("cfg.xml");
		MyDao m = (MyDao) appC.getBean("md");
		System.out.println(m.getMyList());
		System.out.println(m.getMySet());
		System.out.println(m.getMyMap());
		for(int i : m.getArr()) {
		System.out.println(i);
		}
	}

}

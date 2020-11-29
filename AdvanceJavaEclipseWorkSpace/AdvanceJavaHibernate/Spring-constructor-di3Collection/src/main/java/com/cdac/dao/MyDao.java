package com.cdac.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyDao {
	
	private List myList;
	private Set mySet;
	private Map myMap;
	private int [] arr;
	
	public MyDao() {
		System.out.println("constructor called MyDao");
	}

	public MyDao(List myList, Set mySet, Map myMap, int[] arr) {
		super();
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
		this.arr = arr;
		System.out.println("Para constructor called MyDao");
	}

	public List getMyList() {
		return myList;
	}

	public Set getMySet() {
		return mySet;
	}

	public Map getMyMap() {
		return myMap;
	}

	public int[] getArr() {
		return arr;
	}



}

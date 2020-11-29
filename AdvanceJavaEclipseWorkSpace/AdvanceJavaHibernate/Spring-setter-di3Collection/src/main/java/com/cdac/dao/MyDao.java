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

	public List getMyList() {
		return myList;
	}

	public void setMyList(List myList) {
		this.myList = myList;
	}

	public Set getMySet() {
		return mySet;
	}

	public void setMySet(Set mySet) {
		this.mySet = mySet;
	}

	public Map getMyMap() {
		return myMap;
	}

	public void setMyMap(Map myMap) {
		this.myMap = myMap;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	

}

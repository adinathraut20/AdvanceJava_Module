package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Department {

	@Id
	private int dpId;
	private String dpName;
	@OneToMany
	@JoinColumn(name="dpId")
	private Set<Employee> hset;
	
	public Department() {
		hset = new HashSet<Employee>();
		
	}

	public Set<Employee> getHset() {
		return hset;
	}

	public void setHset(Set<Employee> hset) {
		this.hset = hset;
	}

	public Department(int dpId, String dpName) {
		super();
		this.dpId = dpId;
		this.dpName = dpName;
		hset = new HashSet<Employee>();
	}

	@Override
	public String toString() {
		return "Department [dpId=" + dpId + ", dpName=" + dpName + "]";
	}

	public int getDpId() {
		return dpId;
	}

	public void setDpId(int dpId) {
		this.dpId = dpId;
	}

	public String getDpName() {
		return dpName;
	}

	public void setDpName(String dpName) {
		this.dpName = dpName;
	}
	
	

}

package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private int dpId;
	private String dpName;
	
	public Department() {
		
	}

	public Department(int dpId, String dpName) {
		super();
		this.dpId = dpId;
		this.dpName = dpName;
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

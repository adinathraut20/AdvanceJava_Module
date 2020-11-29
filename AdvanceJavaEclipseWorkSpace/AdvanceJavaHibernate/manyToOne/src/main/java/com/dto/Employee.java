package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	private int empId;
	private String eName;
	private float salary;
	@ManyToOne
	@JoinColumn(name="dpId")
	private Department dpId;
	
	public Employee(int empId, String eName, float salary, Department dpId) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.salary = salary;
		this.dpId = dpId;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDpId() {
		return dpId;
	}

	public void setDpId(Department dpId) {
		this.dpId = dpId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + ", dpId=" + dpId + "]";
	}

}

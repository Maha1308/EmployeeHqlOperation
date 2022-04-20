package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hqlemp")
public class EmployeeHql {
	@Id
	private int eid;
	@Column(length=30)
	private String name;
	private int salary;
	@Column(length=30)
	 private String Address;
	private int deptno;
	public EmployeeHql(int eid, String name, int salary, String address, int deptno) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		Address = address;
		this.deptno = deptno;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public EmployeeHql()
	{
		super();
		
	}
	@Override
	public String toString() {
		return "EmployeeHql [eid=" + eid + ", name=" + name + ", salary=" + salary + ", Address=" + Address
				+ ", deptno=" + deptno + "]";
	}
	
	 

}

package com.springrest.springrest.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long employeeNo;
	private String employeeName;
	private Date dateOfJoining;
	private String department;
	private long salary;
	
	public Employee(long id, long employeeNo, String employeeName, Date dateOfJoining, String department, long salary) {
		super();
		this.id = id;
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.dateOfJoining = dateOfJoining;
		this.department = department;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(long employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeNo=" + employeeNo + ", employeeName=" + employeeName
				+ ", dateOfJoining=" + dateOfJoining + ", department=" + department + ", salary=" + salary + "]";
	}
}

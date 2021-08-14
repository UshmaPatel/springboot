package com.springrest.springrest.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.springrest.springrest.entities.Employee;

public interface EmployeeService 
{
	public List<Employee> getEmployees();

	public Employee getEmployee(long empNo);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(long parseLong);

	public Employee getEmployeeByNo(long parseLong);

	public Employee getEmployeeByName(String empNm);
	
}

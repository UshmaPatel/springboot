package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.services.EmployeeService;

@RestController
@CrossOrigin
public class MyController 
{
	
  @Autowired
  private EmployeeService employeeService;
 
  
  //Get the Employess
  @GetMapping("/employees")
  public List<Employee> getEmployees()
  {
	  return  this.employeeService.getEmployees();
  }
  
  //get the employee by empNo
  @GetMapping("/employee/empNo/{empNo}")
  public Employee getEmployeeByNo(@PathVariable long empNo)
  {
	  return this.employeeService.getEmployeeByNo(empNo);
  }
  
//get the employee by empNo
  @GetMapping("/employee/empNm/{empNm}")
  public Employee getEmployeeByName(@PathVariable String empNm)
  {
	  return this.employeeService.getEmployeeByName(empNm);
  }
  
  //employee add
  @PostMapping("/employee")
  public Employee addEmployee(@RequestBody Employee employee)
  {
	return this.employeeService.addEmployee(employee);
	  
  }
  
 // update the course using put request
  @PutMapping("/employee")
  public Employee updateEmployee(@RequestBody Employee employee)
  {
	  return this.employeeService.updateEmployee(employee);
  }
  
  //delete the course
  @DeleteMapping("/employee/{empId}")
  public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String empId)
  {
	  try 
	  {
		  this.employeeService.deleteEmployee(Long.parseLong(empId));
		  return new ResponseEntity<>(HttpStatus.OK);
	  }
	  catch(Exception e) 
	  {
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	  
  }
  
}

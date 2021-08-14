package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.EmployeeDao;
import com.springrest.springrest.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(long empNo) {
		// TODO Auto-generated method stub
		return employeeDao.findByEmpNo(empNo);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		employeeDao.save(employee);
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		Employee entity=employeeDao.findByEmpNo(id);
		employeeDao.delete(entity);
	}

	@Override
	public Employee getEmployeeByNo(long empNo) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByNo(empNo);
	}

	@Override
	public Employee getEmployeeByName(String empNm) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByName(empNm);
	}

	

}

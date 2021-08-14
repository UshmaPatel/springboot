package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springrest.springrest.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long>{

	@Query("select e from Employee e where e.employeeNo=:id")
	Employee findByEmpNo(@Param("id") long id);
	
	@Query("select e from Employee e where e.employeeNo=:empNo")
	Employee getEmployeeByNo(@Param("empNo") long empNo);

	@Query("select e from Employee e where LOWER(e.employeeName)=LOWER(:empNm) ")
	Employee getEmployeeByName(@Param("empNm") String empNm);

}

package com.ciq.service;

import java.util.List;

import com.ciq.model.Employee;

public interface EmployeeService {
	
	public void add(Employee employee);
	
	public List<Employee> findAll();
	
	public void deleteById(Integer eid);
	
	public Employee findById(Integer eid);
	
	public void update(Employee employee);

}

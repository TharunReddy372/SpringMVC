package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeeDAO;
import com.ciq.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public void add(Employee employee) {
		employeeDAO.add(employee);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	public void deleteById(Integer eid) {
		employeeDAO.deleteById(eid);
	}

	@Override
	public Employee findById(Integer eid) {
		return employeeDAO.findById(eid);
	}

	@Override
	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

}

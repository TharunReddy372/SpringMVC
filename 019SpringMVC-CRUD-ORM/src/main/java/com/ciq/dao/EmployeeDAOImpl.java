package com.ciq.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.model.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void add(Employee employee) {
		hibernateTemplate.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Override
	public void deleteById(Integer eid) {
		hibernateTemplate.delete(new Employee(eid,"",0.0));
	}

	@Override
	public Employee findById(Integer eid) {
		Employee employee = hibernateTemplate.get(Employee.class, eid);
		return employee;
	}

	@Override
	public void update(Employee employee) {
		hibernateTemplate.update(employee);;
	}

}

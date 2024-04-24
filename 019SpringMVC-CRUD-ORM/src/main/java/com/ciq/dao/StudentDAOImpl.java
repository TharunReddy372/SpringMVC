package com.ciq.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.model.Student;

@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void add(Student student) {
		hibernateTemplate.save(student);
	}
	
	
	@Override
	public List<Student> findAll() {
		return hibernateTemplate.loadAll(Student.class);
	}

	@Override
	public void deleteById(Integer sid) {
		hibernateTemplate.delete(new Student(sid,"",0.0));
	}


	@Override
	public Student findById(Integer sid) {
		Student student = hibernateTemplate.get(Student.class, sid);
		return student;
	}

	@Override
	public void update(Student student) {
		hibernateTemplate.update(student);
	}
}

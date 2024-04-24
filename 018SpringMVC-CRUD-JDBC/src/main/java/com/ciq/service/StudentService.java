package com.ciq.service;

import java.util.List;

import com.ciq.model.Student;

public interface StudentService {
	
	public void add(Student student);

	public List<Student> findAll();

	public void update(Student student);

	public void deleteById(Integer sid);

	public Student findById(Integer sid);


}

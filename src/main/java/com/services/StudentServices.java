package com.services;

import java.util.List;

import com.model.Student;
import com.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServices {

	@Autowired
	private StudentRepository repo;
	
	public List<Student> listAll(){
		return repo.findAll();
	}
	
	public void save(Student student) {
		repo.save(student);
	}
	
	public Student update(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	
}

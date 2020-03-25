package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repo.StudentRepo;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo repo;

	@Override
	public int saveStudent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student> students = repo.getAll();
		
		return students;

	}
}

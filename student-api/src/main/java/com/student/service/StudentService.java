package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	public int saveStudent();

	public List<Student> getStudents();

}

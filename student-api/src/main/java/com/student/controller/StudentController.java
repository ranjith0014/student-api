package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;

	@GetMapping("/getstudents")
	public List<Student> getStudents() {
		List<Student> getStudent = service.getStudents();
		return getStudent;
	}
}

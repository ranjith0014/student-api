package com.student.repo;

import java.util.*;

import com.student.model.Student;

public interface StudentRepo {
	public int save(Student student);

	public List<Student> getAll();

}

package com.student.repo.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.model.Student;
import com.student.repo.StudentRepo;

@Repository
public class StudentRepolmpl implements StudentRepo {
	private static final String SQL = "select * from student";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

		for (Map<String, Object> row : rows) {
			Student student = new Student();
			student.setId((int) row.get("id"));
			student.setName((String) row.get("name"));
			student.setAge((int) row.get("age"));

			students.add(student);
		}

		return students;

	}

}

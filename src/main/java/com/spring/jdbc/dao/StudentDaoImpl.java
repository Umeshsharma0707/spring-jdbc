package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public int insert(Student student) {
		String query = "insert into student (rollno, name, city) values (?,?,?)";
		int result = this.jdbcTemplate.update(query,student.getRollno(),student.getName(),student.getCity());
		return result;
	}

}

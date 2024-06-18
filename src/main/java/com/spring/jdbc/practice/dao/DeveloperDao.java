package com.spring.jdbc.practice.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.practice.entities.Developer;

public class DeveloperDao {
	
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}




	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




	public int insertDeveloper(Developer developer) {
		String sql = "insert into developer (name,language,salary) values (?,?,?)";
		
		int result = this.jdbcTemplate.update(sql,developer.getName(),developer.getLanguage(),developer.getSalary());
		
		return result;
	}
	
}

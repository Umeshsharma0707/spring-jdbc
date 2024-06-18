package com.spring.jdbc.practice.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.practice.entities.Developer;

public class DeveloperDao implements DeveloperInterface {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertDeveloper(Developer developer) {
		String sql = "insert into developer (name,language,salary) values (?,?,?)";
		int result = this.jdbcTemplate.update(sql, developer.getName(), developer.getLanguage(), developer.getSalary());
		return result;
	}

// update method
	@Override
	public int UpdateDeveloper(Developer developer) {
		String sql = "update developer set name = ?, language = ?, salary = ? where id = ?";

		int result = this.jdbcTemplate.update(sql, developer.getName(), developer.getLanguage(), developer.getSalary(),
				developer.getId());
		return result;
	}

	// deleting method
	@Override
	public int deleteDeveloper(Developer developer) {
		String sql = "delete from developer where id = ?";
		int result = this.jdbcTemplate.update(sql,developer.getId());
		return result;
	}

}

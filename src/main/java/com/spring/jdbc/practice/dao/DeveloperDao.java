package com.spring.jdbc.practice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.practice.entities.Developer;

@Component("dao")
public class DeveloperDao implements DeveloperInterface {

	@Autowired
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

	// get single developer object method
	@Override
	public Developer getDeveloper(int developerid) {
		// selecting single developer data
		
		String sql = "select * from developer where id = ?";
		
		RowMapper<Developer> rowMapper = new RowMapperImpl();
		Developer developer = this.jdbcTemplate.queryForObject(sql, rowMapper, developerid);
		
		return developer;
	}

	// get all developers method
	@Override
	public List<Developer> getAllDevelopers() {
		// selecting all developers
		
		String sql = "select * from developer";
		RowMapper<Developer> rowMapper = new RowMapperImpl();
		List<Developer> developers = this.jdbcTemplate.query(sql, rowMapper);
		return developers;
	}

}

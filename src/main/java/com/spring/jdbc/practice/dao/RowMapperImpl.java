package com.spring.jdbc.practice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.practice.entities.Developer;

public class RowMapperImpl implements RowMapper<Developer>{

	@Override
	public Developer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Developer d = new Developer();
		d.setId(rs.getInt(1));
		d.setName(rs.getString(2));
		d.setLanguage(rs.getString(3));
		d.setSalary(rs.getDouble(4));
		return d;
	}
	
	

}

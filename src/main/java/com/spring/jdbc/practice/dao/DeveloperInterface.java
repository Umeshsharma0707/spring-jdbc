package com.spring.jdbc.practice.dao;

import com.spring.jdbc.practice.entities.Developer;

public interface DeveloperInterface {
	public int insertDeveloper(Developer developer);
	public int UpdateDeveloper(Developer developer);
	public int deleteDeveloper(Developer developer);
}

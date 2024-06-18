package com.spring.jdbc.practice.dao;

import java.util.List;

import com.spring.jdbc.practice.entities.Developer;

public interface DeveloperInterface {
	public int insertDeveloper(Developer developer);
	public int UpdateDeveloper(Developer developer);
	public int deleteDeveloper(Developer developer);
	public Developer getDeveloper(int developerid);
	public List<Developer> getAllDevelopers();
}

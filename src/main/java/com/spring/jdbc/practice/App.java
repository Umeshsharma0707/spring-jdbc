package com.spring.jdbc.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.practice.dao.DeveloperDao;
import com.spring.jdbc.practice.entities.Developer;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/jdbc/practice/practice-config.xml");
		
		DeveloperDao dao = context.getBean("dao",DeveloperDao.class);
		
		Developer d = new Developer();
		
		d.setName("umesh");
		d.setLanguage("java");
		d.setSalary(95000);
		
		int result = dao.insertDeveloper(d);
		
		System.out.println("row affected in developer table : " + result);
		
	}
}

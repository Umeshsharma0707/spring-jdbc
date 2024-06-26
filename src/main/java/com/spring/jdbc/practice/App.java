package com.spring.jdbc.practice;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.practice.dao.DeveloperDao;
import com.spring.jdbc.practice.entities.Developer;

public class App {
	public static void main(String[] args) {
		
	/*	ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/jdbc/practice/practice-config.xml");
		
		DeveloperDao dao = context.getBean("dao",DeveloperDao.class);
		
		*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(com.spring.jdbc.JdbcConfig.class);

		DeveloperDao dao = context.getBean("dao",DeveloperDao.class);
		
		List<Developer> allDevelopers = dao.getAllDevelopers();
		
		for(Developer d : allDevelopers) {
			System.out.println(d);
		}
		/*
		Developer developer = new Developer();
		
		int id = 4;
		
		try {
			Developer developer1 = dao.getDeveloper(id);
			System.out.println(developer1);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(id + " : is not found");
			
		}
		*/
	/*	Developer d1 = new Developer();
		
		d1.setId(3);
		int result = 0;
		try {
			 result = dao.deleteDeveloper(d1);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error in deleting developer");
		}
		finally {
			System.out.println("total deleted rows : " + result);
		}
		*/
		
		/*Developer d = new Developer();
		
		d.setId(3);
		d.setName("rahul");
		d.setLanguage("python");
		d.setSalary(95600);
		
		int updatedRows = dao.UpdateDeveloper(d);
		
		System.out.println("total rows updated : " + updatedRows);
	
	*/
	
		
	/*
	 * Developer d = new Developer(); d.setName("shivam"); d.setLanguage("java");
	 * d.setSalary(95000); int result = dao.insertDeveloper(d);
	 * System.out.println("row affected in developer table : " + result);
	 * 
	 */
		
		
	}
}

package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = 
    		   new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       
     StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
     
     Student student = new Student();
     
     student.setRollno(25);
     student.setName("rahul");
     student.setCity("pune");
     
     int result = studentDao.insert(student);
     
     System.out.println("student added : " + result);
      
    }
}

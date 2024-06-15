package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
       
      JdbcTemplate template =  context.getBean("jdbcTemplate", JdbcTemplate.class);
      
      // insert query
      
      String query = "insert into student (rollno, name, city) values (?,?,?)";
       
      // firing query
      
      int result = template.update(query, 12,"mahesh","delhi");
      
      System.out.println("no of rows inserted " + result);
      
    }
}

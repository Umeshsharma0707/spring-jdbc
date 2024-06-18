package com.spring.jdbc.practice.entities;

public class Developer {
		private String name;
		private String language;
		private double salary;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Developer [name=" + name + ", language=" + language + ", salary=" + salary + "]";
		}
		
		
		
}

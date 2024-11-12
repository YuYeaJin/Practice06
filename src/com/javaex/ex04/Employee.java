package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class Employee extends User {
	   
	   protected int salary;
	   
	   
	   public Employee() {}
	   
	   public Employee(String id, String password, String name, int salary) {
	      super(id, password, name);
	      this.salary = salary;

	   }
	   
	   List<String> user = new ArrayList<>();
	   list
	   
	   
	   public int getSalary() {
	      return salary;
	   }
	   
	   @Override
	   public void showInfo() {
	      System.out.println("#아이디: " + id + ", #패스워드: " + password + ", #이름: " + name + ", #월급: "+ salary);
	   }
	   

	}


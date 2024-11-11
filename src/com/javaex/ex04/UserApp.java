package com.javaex.ex04;

public class UserApp {

	   public static void main(String[] args) {
	      
	      
	      User cus1 = new Customer("jws", "j1234", "정우성", 1000);
	      
	      cus1.id = "jws";
	      cus1.password = "j1234";
	      cus1.name = "정우성";
	      cus1.showInfo();
	      
	      
	      User cus2 = new Customer("yjs", "y2345", "이효리", 2000);
	      cus2.id = "yjs";
	      cus2.password = "y2345";
	      cus2.name = "이효리";
	      cus2.showInfo();
	      
	      
	      User emp = new Employee("master", "m7788", "운영자", 500_000);
	      emp.id = "master";
	      emp.password = "m7788";
	      emp.name = "운영자";
	      emp.showInfo();
	      
	      
	      System.out.print("운영자의 월급은 5000000원 입니다.");
	   }
	   
	   

	}

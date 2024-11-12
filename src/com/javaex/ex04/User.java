package com.javaex.ex04;



//	배열로 다시 해 보기...꼭 배열이 있어야 하는건가? 없으면 안되나? 너무해 ㅠㅠ
public class User {
	   protected String id;
	   protected String password;
	   protected String name;
	   
	   public User() {}
	   public User(String id, String password, String name) {
	      this.id = id;
	      this.password = password;
	      this.name = name;
	   }
	  
	   
	   public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	   
	   
	   public void showInfo() {	 
		   
	   }
	   
	   
	}

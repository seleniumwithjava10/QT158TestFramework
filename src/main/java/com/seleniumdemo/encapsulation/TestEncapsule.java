package com.seleniumdemo.encapsulation;

public class TestEncapsule {
	
	private String username;// null
	
	private String password; //null
	
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public void setPassword(String password) {
	   this.password=password;	
	}
	
	
	public String getUserName() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public static void main(String[] args) {
		TestEncapsule tet= new TestEncapsule();
		
		tet.setUsername("Venkat");
		tet.setPassword("Tetsing@123");
		
	System.out.println(tet.getUserName());
		System.out.println(tet.getPassword());
				
	}

}

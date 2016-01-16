package com.digitek.exercise3;

public class Person {

	
	//Person p = new Person();
	public static String writeName(){
		String fname = "JINISHA";
		return fname;
		}
	

	public static String getName() {
		
		
		String name = writeName();
		String lname = " JOSEPH"; 
		return name+lname;
	}

	public static void setName() {
		
		String fullname = getName();
		System.out.println("Full Name is "+fullname);
	}
	
	public static void main(String args[])
	{	
		setName();
		String n = writeName();
		System.out.println("My name is "+n);
	}
}

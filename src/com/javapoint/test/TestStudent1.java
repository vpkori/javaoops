package com.javapoint.test;

//Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class Student{  
int id;  
String name;  
}  

public class TestStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize object - By reference variable
		//We can also create multiple objects and store information in it through reference variable.
		Student s1=new Student();  
		Student s2 = new Student();
		s1.id=5;
		s1.name="Vindeshwar";
		  System.out.println(s1.id);  
		  System.out.println(s1.name);  
		  System.out.println(s2.id);  
		  System.out.println(s2.name);  
	}

}

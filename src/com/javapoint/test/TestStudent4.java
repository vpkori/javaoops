package com.javapoint.test;

class Student4{  
	 int rollno;  
	 String name;  
	 void insertRecord(int r, String n){  
	  rollno=r;  
	  name=n;  
	 }  
	 void displayInformation(){System.out.println(rollno+" "+name);}  
	}  

public class TestStudent4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student4 s1=new Student4();  
		  Student4 s2=new Student4();  
		  s1.insertRecord(111,"Karan");  
		  s2.insertRecord(222,"Aryan");  
		  s1.displayInformation();  
		  s2.displayInformation();  
	}

}

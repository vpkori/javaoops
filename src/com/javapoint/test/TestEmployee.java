package com.javapoint.test;
//3) Object and Class Example: Initialization through a constructor
class Employee{  
    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display(){System.out.println(id+" "+name+" "+salary);}  
} 

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();  
	    Employee e2=new Employee();  
	    Employee e3=new Employee();  
	    e1.insert(101,"ajeet",45000);  
	    e2.insert(102,"irfan",25000);  
	    e3.insert(103,"nakul",55000);  
	    e1.display();  
	    e2.display();  
	    e3.display();  
	    
	}

}

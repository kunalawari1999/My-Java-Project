package com.days_11;

public class Employee {
	int id;
	String name;
	float salary;
	
	public void getDetails(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Emp. ID= "+id+"\nEmp name= "+name+"\nEmp Salary= "+salary);
	}
	public static void main(String[] args) {
		Employee a=new Employee();
		a.getDetails(111,"ABC",30000);
		a.display();
		
		Employee b=new Employee();
		b.getDetails(222,"PQR",40000);
		b.display();
		
		Employee c=new Employee();
		c.getDetails(333,"XYZ",50000);
		c.display();
		

	}

}

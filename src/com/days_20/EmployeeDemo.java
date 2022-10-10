package com.days_20;

import java.util.Arrays;

class Employee{
	int id;
	String name;
	int salary;
	
	Employee (int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
}
}
public class EmployeeDemo {

	public static void main(String[] args) {
	Employee emp[]=new Employee[3];
	
	emp[0]=new Employee(1,"ABC",50000);
	emp[1]=new Employee(2,"XYZ",60000);
	emp[2]=new Employee(3,"PQR",40000);
	
	for(int i=0;i<emp.length;i++) {
		System.out.println(emp[i].id+" "+emp[i].name+" "+emp[i].salary);	
	}
	

	}

}

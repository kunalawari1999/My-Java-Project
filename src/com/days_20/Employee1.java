package com.days_20;

import java.util.Scanner;

public class Employee1 {
	int id;
	String name;
	int salary;
	
	Employee1(int id,String name,int salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employee");
		int n =sc.nextInt();
		Employee1 emp[]= new Employee1[n];
		System.out.println("Enter Employee details");
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter salary");
			int salary=sc.nextInt();
			
			emp[i]=new Employee1(id,name,salary);
		}
		
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}

	}

}

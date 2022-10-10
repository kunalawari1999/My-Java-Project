package com.days_20;

import java.util.Scanner;

public class SalaryIncrease {

	int id;
	String name;
	double salary;
	
	SalaryIncrease (int id,String name,double salary){
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
		SalaryIncrease emp[]= new SalaryIncrease[n];
		System.out.println("Enter Student details");
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter salary");
			double salary=sc.nextInt();
			
			emp[i]=new SalaryIncrease(id,name,salary);
		}
		
		System.out.println("...........Updated Salary..........");
		for(int i=0;i<emp.length;i++) {
		if(emp[i].salary<15000) {
			emp[i].salary=emp[i].salary*1.10;
		}
		}
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
	}

}

package com.projectcoffee;

import java.util.Scanner;

public class Coffee_Shop extends Bill_Calculate{
	
	public void emp_Details() {
		Employee x=new Employee(7,"Amit",25000);
		x.emp_Details();
		System.out.println(x);
	}
		
	public static void main(String []args) {
	Coffee_Shop c=new Coffee_Shop();
	Scanner sc=new Scanner(System.in);
	System.out.println("**WELCOME**");
	System.out.println("For Employee Details press 1");
	System.out.println("For Menu press 2");
	int n=sc.nextInt();
	if(n==1) {
	c.emp_Details();
	System.out.println("For menu press 2");
	int m=sc.nextInt();
	if(m==2) {
	bill();
	}
	}
	else {
		bill();
	}
	System.out.println("Thank you for visit ....Visit Again");
	}

}


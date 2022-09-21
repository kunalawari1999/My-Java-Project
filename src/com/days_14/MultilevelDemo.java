package com.days_14;
import java.util.*;
class Bank {
	String name;
}
class Employee extends Bank {
	int empid;
}
class Account extends Employee {
	String type;
	void show() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details");
		name=sc.next();
		empid=sc.nextInt();
		type=sc.next();
		System.out.println(name+" "+empid+" "+type);
	}
	
}

public class MultilevelDemo {

	public static void main(String[] args) {
		Account a=new Account();
		a.show();

	}

}

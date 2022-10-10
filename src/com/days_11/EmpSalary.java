package com.days_11;

public class EmpSalary {
	int empid;
	String name;
	double salary;
	double grossSal;
	
	   EmpSalary(int empid,String name,double salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		System.out.println("Emp id="+empid+"\nEmp Name="+name+"\nEmp basic Salary"+salary);
	}
	EmpSalary (){
		this(111,"A",40000);
		grossSal=salary+(0.35*salary)+(0.20*salary);
	}
	EmpSalary(int a){
		this();
		System.out.println("GrossSalary= "+grossSal);
	}
	public static void main(String[] args) {
	// EmpSalary a=new EmpSalary(111,"A",40000.00);
	 EmpSalary a=new EmpSalary(2);
	}
}


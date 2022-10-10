package com.projectcoffee;

public class Employee {
	private int emp_id;
	private String emp_name;
	private int emp_sal;
	
	Employee (int emp_id,String emp_name,int emp_sal){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
	}
	public String toString() {
		return emp_id+" "+emp_name;
	}

	public void emp_Details() {
		System.out.println("Employee Details");
		Employee p=new Employee(1,"Ravi",30000);
		Employee q=new Employee(2,"Manas",30000);
		Employee r=new Employee(3,"Prajwal",25000);
		Employee s=new Employee(4,"Prajakta",25000);
		Employee t=new Employee(5,"Namrata",25000);
		Employee u=new Employee(6,"Sonam",25000);
		
		System.out.println(p+"\n"+q+"\n"+r+"\n"+s+"\n"+t+"\n"+u);
	}
	public static void main(String[] args) {
		Employee c=new Employee(1,"A",1000);
		c.emp_Details();
		

	}

}

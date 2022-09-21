package com.days_10;

public class Student {
	int studid;
	String name;
	int phy;
	int chem;
	int math;
	float percent;
	
	public void sDetails(int id,String n,int ph,int ch,int mat) {
		studid=id;
		name=n;
		phy=ph;
		chem=ch;
		math=mat;
	}
	public void percentage() {
		int total=phy+chem+math;
		 percent=((100*total)/300);
	}
	public void display() {
		System.out.println("Student ID = "+studid+"\n Student Name = "+name+"\n Physics Marks = "+phy+"\n Chemistry Marks = "+chem+"\n Mathematics Marks = "+math+"\n Student Percentage ="+percent);
	}

	public static void main(String[] args) {
		Student a=new Student();
		a.sDetails(111,"ABC",86,89,95);
		a.percentage();
		a.display();
		
		Student b=new Student();
		b.sDetails(222,"XYZ",90, 67,98);
		b.percentage();
		b.display();
		

	}

}

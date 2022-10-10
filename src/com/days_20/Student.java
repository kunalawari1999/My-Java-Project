package com.days_20;

class Marks{
	int phy;
	int math;
	int chem;
	
	Marks(int phy,int math,int chem){
		this.phy=phy;
		this.math=math;
		this.chem=chem;
	}
	
	public String toString() {
		return phy+" "+math+" "+chem;
	}
}
class StudDetails{
	int id;
	String name;
	Marks m;
	
	StudDetails(int id,String name,Marks m){
		this.id=id;
		this.name=name;
		this.m=m;
	}
	public String toString() {
		return id+" "+name+" "+m;
	}
}

public class Student {

	public static void main(String[] args) {
		StudDetails s[]=new StudDetails[3];
		s[0]= new StudDetails(1,"AA",new Marks(75,80,70));
		s[1]= new StudDetails(2,"BB",new Marks(77,85,90));
		s[2]= new StudDetails(3,"CC",new Marks(90,95,78));

		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}

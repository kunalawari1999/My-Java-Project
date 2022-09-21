package com.days_14;
 import java.util.*;
class People {	
	String name;
	int id ;
}
class Student extends People{
	
		int rno;	
		float percentage;
}
class Worker extends Student {
	void show() {
		name="ABC";
		id=111;
		rno=10;
		percentage=85.90F;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter details ");
		String field=sc.next();
		int experience=sc.nextInt();
		int age=sc.nextInt();		
		System.out.println(name+" "+id+" "+rno+" "+percentage+" "+field+" "+experience+" "+age);
	}
}
public class MultilevelDemo2 {

	public static void main(String[] args) {
	Worker w=new Worker();
	w.show();
	}
}

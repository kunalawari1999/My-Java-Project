package com.days_15;

import java.util.Scanner;

abstract class Number{
	 int a;
	 
	 public void assign(int a) {
		 this.a=a;
	 }
 }
 interface Notable {
	 Scanner sc=new Scanner(System.in);
	 int b=sc.nextInt();
 }
 class Number3 extends Number implements Notable{
	public int add(int a) {
		//System.out.println("Addition ="+(a+b));
		return a+b;
	}
	 
 }
 
public class AbstractDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers for Addition");
		int num=sc.nextInt();
		Number3 z= new Number3();  
		z.add(num);
		System.out.println("Addition="+(z.add(num)));
		

	}

}

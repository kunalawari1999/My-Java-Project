package com.days_20;

import java.util.Scanner;

public class NumPresentOrNot {
	
	 void checkNumber(int a[],int num) {
		 boolean ispresent=false;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==num) {
				 System.out.println("Number is present");
				 ispresent=true;
				 break;
			 }
		 }
		 if(ispresent==false) {
			 System.out.println("Number is not present");
		 }
	 }

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array Length");
	int n=sc.nextInt();
	System.out.println("Enter array element");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enter number that you want to search");
	int num=sc.nextInt();

	
	NumPresentOrNot p=new NumPresentOrNot();
	p.checkNumber(a,num);
	}

}

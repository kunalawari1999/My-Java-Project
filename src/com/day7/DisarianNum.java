package com.day7;

import java.util.Scanner;

public class DisarianNum {

	public static void main(String[] args) {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter Num");
	 int num=sc.nextInt();
	 int copy=num;
	 int sum=0;
	 
	 
	 while(num>0) {
		 int r=num%10;
		 int p=1;
		 int power=(int)(Math.pow(r,p));
		 sum=sum+power;
		 p++;
		num= num/10;
		 
	 }
	 
	 System.out.println("Sum of powers ="+ sum);
 num=copy;
 if(num==sum) {
	 System.out.println("Num is disarian");
 }
 else {
	 System.out.println("Num is not disarian ");
 }
	}

}

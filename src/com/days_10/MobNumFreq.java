package com.days_10;

import java.util.Scanner;

public class MobNumFreq {
	public static void main(String[]ergs) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Mobile Number");
	long mob=sc.nextLong();
	System.out.println("Enter digit to count frequency");
	int num=sc.nextInt();
	int count=0;
	while(mob>0){ 
		long r=mob%10;
		if(num==r) {
			count++;
		}
		mob=mob/10;
	}
	System.out.println("Frequency of "+num+" is = "+count);
	
	}
}
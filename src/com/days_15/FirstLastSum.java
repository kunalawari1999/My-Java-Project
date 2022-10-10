package com.days_15;

import java.util.Scanner;

public class FirstLastSum {
	
	public int sumDigit(int n) {
		int sum=0;
		int reverse=1;
		int lastDig=n%10;
		while(n>0) {
		int r=n%10;
		reverse=reverse*10+r;
		n=n/10;
		}
		int firstDig=reverse%10;
		int sum1=firstDig+lastDig;
		return sum1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
	 FirstLastSum a=new FirstLastSum();
	 int sum=a.sumDigit(num);
	 System.out.print("First and last digit sum ="+sum);

	}

}

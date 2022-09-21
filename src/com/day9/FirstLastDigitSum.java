package com.day9;

import java.util.Scanner;

public class FirstLastDigitSum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	int lastDigit=num%10;
	int reverse=0;
	while(num>0) {
		int r=num%10;
		reverse=reverse*10+r;
		num=num/10;
		
	}
int firstDigit=reverse%10;
System.out.println("Sum of first and last digit "+(firstDigit+lastDigit));
	}

}

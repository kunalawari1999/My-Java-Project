package com.day2;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Write a number");
	int num=sc.nextInt();
	if(num==0) {
		System.out.println("Number is Zero");
	}
	else if (num<0) {
		System.out.println("Number is Negative");
		
	}
	else {
		System.out.println("Number is Positive ");
	}
	
	

	}

}

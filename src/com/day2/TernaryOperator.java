package com.day2;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter 1 st Number ");
	int num1=sc.nextInt();
	System.out.println("Enter 2 nd  Number ");
	int num2 =sc.nextInt();
	
	int greater = num1>num2 ? num1 :num2 ;
	System.out.println("the greater number is "+greater);
	

	}

}

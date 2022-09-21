package com.day2;

import java.util.Scanner;

public class TernaryGreatNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1");
		int num1=sc.nextInt();
		System.out.println("Enter Num2");
		int num2=sc.nextInt();
		System.out.println("Enter Num3");
		int num3=sc.nextInt();
		
		int greater=num1>num2&&num1>num3 ? num1:num1<num2&&num3<num2 ? num2:num3;
System.out.println("The greater Number is "+greater);
	}

}

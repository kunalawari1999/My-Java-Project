package com.day2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter Year");
		Scanner sc=new Scanner(System.in);
		int yr = sc.nextInt();
		
	String leap = yr%4==0 ?"leap year":"Not leap year";
	System.out.println("The year is leap "+leap);
	

	}

}

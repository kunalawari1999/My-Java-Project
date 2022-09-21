package com.basic;

import java.util.Scanner;

public class DaysCalculation {

	public static void main(String[] args) {
		double days ,weeks,year ;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Days ");
		days=sc.nextDouble();
		weeks= days/7;
		System.out.println("There are "+weeks+" weeks in  "+days+" days .");
		year=days/365;
		System.out.println("There are "+ year+" year in "+days+" days .");
		

	}

}

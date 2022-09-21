package com.day7;

import java.util.Scanner;

public class DigitInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if(num<=9 && num>=0) {
			System.out.println("Number is single digit");
		}
		else if (num<=99 && num>=10) {
			System.out.println("Number is Double digit");
		}
		else if (num<=999 && num>=100) {
			System.out.println("Number is Triple digit");
		}
		else if (num<0 && num >=-9) {
			System.out.println("Number is single digit");
		}
		else if (num<=-10 && num >=-99) {
			System.out.println("Number is double digit");
		}
		else if (num<=-100 && num>=-999) {
			System.out.println("Number is Triple digit");
		}
		

	}

}

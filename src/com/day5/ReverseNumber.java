package com.day5;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	 System.out.println("Enter Number");
		int num=sc.nextInt();
		int num1=num;
		int reverse=0;
		
		while(num>0) {
        int r=num%10;
        reverse=reverse*10+r;
        num=num/10;
		}
		System.out.println("Reverse number of given number " +reverse);
		

	
	if (num1==reverse) {
		System.out.println("Number is Palindrom");
		
	}
	else
		System.out.println("Number is not palindrom");
	}
}

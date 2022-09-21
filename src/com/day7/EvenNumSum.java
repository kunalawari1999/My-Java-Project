package com.day7;

import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int r=num%10;
			if(num%2==0) {
				sum=sum+r;
			}
			num=num/10;
		}
		System.out.println("Sum of even number in digit ="+sum);
		
		

	}

}

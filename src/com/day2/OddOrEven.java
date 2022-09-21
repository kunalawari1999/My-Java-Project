package com.day2;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		if(num%2!=0) {
			System.out.println("Number is Odd");
		}
		else 
		System.out.println("Number is Even");	
		
		

	}

}

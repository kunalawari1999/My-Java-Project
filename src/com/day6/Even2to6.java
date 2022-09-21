package com.day6;

import java.util.Scanner;

public class Even2to6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		
		if(num>=2&&num<=6) {
			if(num%2==0) {
				System.out.println("Even Number");
			}
		}
			else if(num>=7&&num<=10) {
				if(num%2==0) {
					System.out.println("Even");
				}
			}
				else if (num%2!=0) {
					System.out.println("Odd Number");
				}
				else {
					System.out.println("odd");
				}
			}
		

	

}

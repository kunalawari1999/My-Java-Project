
package com.day5;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		while(num>0) {
			int r=num%10;
			sum=sum+r;
			product=product*r;
			num=num/10;
		}
		
		
		if(sum==product) {
			System.out.println("Nuber Is Spy");
		}
		else {
			System.out.println("Number not spy");
		}

	}

}

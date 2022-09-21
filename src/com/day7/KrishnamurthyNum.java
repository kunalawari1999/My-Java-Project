package com.day7;

import java.util.Scanner;

public class KrishnamurthyNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		int sum=0;
		
		int copy=num;
		
		while(num>0) {
			int r=num%10;
			int fact=1;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
			
		}
		
		num=copy;
		System.out.println("Original num="+num);
		System.out.println("Sum of factorial in digit="+sum);
		if(sum==num) {
			System.out.println("Number is krishnamurthy");
		}
		else {
			System.out.println("Number Is not Krishnamurthy");
		}

	}

}

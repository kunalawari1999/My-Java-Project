package com.days_14;

import java.util.Scanner;

public class EvenDigitSum {
	
	public int sumEven(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			if(r%2==0) {
				sum=sum+r;
			}
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		EvenDigitSum a=new EvenDigitSum();
		int num=sc.nextInt();
	      int s=a.sumEven(num);
	     System.out.println("Even digit sum ="+s);
	}

}

package com.days_13;

import java.util.Scanner;

public class NumSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Wrire 1 to 7 num with missing any 1 term");
		int n=sc.nextInt();
		int sum=0;
		int sum1=0;
		for(int i=1;i<=7;i++) {
		  sum=sum+i;
	        }
		while(n>0) {
			int r=n%10;
			sum1=sum1+r;
			n=n/10;
		}
		if(sum==sum1) {
			System.out.println("no num miss");
		}
		else {
		System.out.println("miss num="+(sum-sum1));	
		}
		}
	}



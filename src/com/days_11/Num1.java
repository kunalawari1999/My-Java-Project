package com.days_11;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		int sum=0;
		int ans=0;
		
		while(num>0) {
			int r=num%10;
			if(r==1) {
				r=0;
			}
			sum=sum*10+r;
			num=num/10;
		}
		// System.out.println(sum);
		while (sum>0) {
			int b=sum%10;
			ans=ans*10+b;
			sum=sum/10;
		}
		System.out.println(ans);

	}

}

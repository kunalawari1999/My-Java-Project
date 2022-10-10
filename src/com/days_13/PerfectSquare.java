package com.days_13;

import java.util.Scanner;

public class PerfectSquare {

	static void printSquare(int n,int m) {
		for(int i=1;i<=50;i++) {
		 if((i*i)>=n&&(i*i)<=m) {
			 System.out.println(i*i);
		 }
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		int n=sc.nextInt();
		System.out.println("Enter last num");
		int m=sc.nextInt();
		printSquare(n,m);
	}

}

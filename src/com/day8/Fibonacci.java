package com.day8;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Num");
		int n=sc.nextInt();
		int firstTerm=0,secondTerm=1;
		for(int i=1;i<=n;i++) {
			System.out.print(firstTerm+" ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		

	}

}

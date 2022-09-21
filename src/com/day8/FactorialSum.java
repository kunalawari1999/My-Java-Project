package com.day8;

import java.util.Scanner;

public class FactorialSum {

	public static void main(String[] args) {
		int factorial=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter terms");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
			sum=sum+factorial;
		}
		System.out.println("The sum of factorial of "+num+"th term is "+sum);

	}

}

//This is program of find SUM till n th term factorial .
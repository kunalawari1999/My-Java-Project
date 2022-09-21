package com.test17sept;

import java.util.Scanner;

public class SalesCommision {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sale amount");
		double sum=0;
		int sale=sc.nextInt();
		if(sale>2000) {
			sum=(sale*0.05);
		}
		System.out.println("Commision="+sum);

	}

}

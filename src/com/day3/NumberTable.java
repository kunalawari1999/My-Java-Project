package com.day3;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num");
		int num = sc.nextInt();
		System.out.println("Table Of "+num);
		for (int i=1;i<=10;i++) {
			System.out.println(i*num);
		}
		

	}

}

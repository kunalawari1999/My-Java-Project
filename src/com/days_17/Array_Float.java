package com.days_17;

import java.util.Scanner;

public class Array_Float {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		float []a=new float[n];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextFloat();
		}
		//System.out.println("Reverse order");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}

package com.days_17;

import java.util.Scanner;

public class SumOfArrayElement {

	int arraySum(int[] s) {
		int sum = 0;
		for (int i = 0; i < s.length; i++) { // SUM OF ARRAY
			sum = sum + s[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Array Element");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		SumOfArrayElement k = new SumOfArrayElement();
		int b = k.arraySum(a);
		System.out.println("Sum=" + b);
	}
}

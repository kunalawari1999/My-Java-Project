package com.days_17;

import java.util.Scanner;

public class AlternateNum {

	void alternate(int d[]) {
		for (int i = 0; i < d.length; i++) {
			if (i % 2 == 0) {
				System.out.print(d[i] + " ");
			}
		}
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
		AlternateNum b = new AlternateNum();
		b.alternate(a);

	}
}

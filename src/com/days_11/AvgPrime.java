
package com.days_11;

import java.util.Scanner;

public class AvgPrime {
	public float prime(int n) {
		float sum = 0;
		float count = 0;
		for (int num = 1; num <= n; num++) {
			boolean isprime = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime == true) {
				count++;
				sum = sum + num;
			}
		}
		System.out.println("sum=" + sum + " count=" + count);
		 System.out.println("Average of prime number between 1 to 20 is"+(sum/count));
		return sum;
	}

	public static void main(String[] args) {

		AvgPrime a = new AvgPrime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		float b = a.prime(num);
//int b=a.prime();
		System.out.println(b);
	}
}

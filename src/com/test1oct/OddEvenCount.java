package com.test1oct;

import java.util.Scanner;

public class OddEvenCount {
	
	public void countOddEven(int[]a) {
		int countEven=0;
		int countOdd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		System.out.println("Number of even elements="+countEven);
		System.out.println("Number of odd elements="+countOdd);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		OddEvenCount j=new OddEvenCount();
		j.countOddEven(a);
	}

}

package com.days_17;

import java.util.Scanner;

public class MaxNum {
	
	int maximumNum(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter class length");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array values");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		MaxNum m=new MaxNum();
		System.out.println("Max num ="+m.maximumNum(a));

	}

}

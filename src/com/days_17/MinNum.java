package com.days_17;

import java.util.Scanner;

public class MinNum {
	
	int minimumNum(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min){
				min=a[i];
			}
		}
		return min;
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
		MinNum m=new MinNum();
		System.out.println("Min num ="+m.minimumNum(a));

	}

}

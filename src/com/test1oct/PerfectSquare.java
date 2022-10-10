package com.test1oct;

import java.util.Scanner;

public class PerfectSquare {
	
	public static void  showSquare(int a[] ){
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<500000;j++) {
		if(a[i]==(j*j)){
		System.out.println(a[i]);	
		}
		}
	}
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
		
     PerfectSquare.showSquare(a);
	}

}


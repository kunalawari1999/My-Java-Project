package com.days_21;

import java.util.Scanner;

public class Pattern_2D {
	 void sum_Row(int a[][]) {
     	for(int i=0;i<a.length;i++) {
     		for(int j=0;j<a.length;j++) {
     			
     			System.out.print("*"+" ");
     		}
     		System.out.println();
     	}
     }

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows in array ");
	int n=sc.nextInt();
	System.out.println("Enter number of column in array");
	int m=sc.nextInt();
	int a[][]=new int[n][m];
	System.out.println("Enter array element");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();
		}
	}
   Pattern_2D l=new Pattern_2D();
	l.sum_Row(a);
	
}
}

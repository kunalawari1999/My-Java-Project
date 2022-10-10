package com.days_21;

import java.util.Scanner;

public class Column_Sum_2DArray {
	 void sum_Column(int a[][]) {
     	for(int i=0;i<a.length;i++) {
     		int sum=0;
     		for(int j=0;j<a[i].length;j++) {
     			sum=sum+a[j][i];
     			System.out.print(a[i][j]+" ");
     		}
     		System.out.print("  = "+sum);
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
	Column_Sum_2DArray l=new Column_Sum_2DArray();
	l.sum_Column(a);
	
}
}

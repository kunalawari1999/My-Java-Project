package com.days_21;

import java.util.Scanner;

public class Add2dArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows in first array");
		int n=sc.nextInt();
		System.out.println("Enter number of column in first array");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
          
		System.out.println("Enter first array element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter number of rows in Second array");
		int y=sc.nextInt();
		System.out.println("Enter number of column in second array");
		int z=sc.nextInt();
		int b[][]=new int[y][z];
          
		System.out.println("Enter second array element");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("ARRAY A ....");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("ARRAY B....");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int c[][]=new int [n][m];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition of array A and B------");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}

package com.test8oct;

import java.util.Scanner;

public class Row_Reverse2D {
	
	public void reverse_Row(int a[][]) {
		int b[][]=new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=a[i].length-1;j>=0;j--) {
				b[i][count]=a[i][j];
				count++;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			System.out.print(b[i][j]+" ");
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
		Row_Reverse2D p=new Row_Reverse2D();
         p.reverse_Row(a);
		
		
	}

}

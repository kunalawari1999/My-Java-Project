package com.days_21;

import java.util.Scanner;

public class Min_Num_Row {

	  void row_Min(int a[][]) {
	      	for(int i=0;i<a.length;i++) {
	      		int min=a[i][i];
	      		for(int j=0;j<a[i].length;j++) {
	      			if(a[i][j]<min) {
	      				min=a[i][j];
	      			}
	      			System.out.print(a[i][j]+" ");
	      		}
	      		System.out.print("  = "+min);
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
		Min_Num_Row l=new Min_Num_Row();
		l.row_Min(a);
		
	}
	}

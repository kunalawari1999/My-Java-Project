package com.days_21;

import java.util.Scanner;

public class Max_Num_Column {

            void column_Max(int a[][]) {
            	for(int i=0;i<a.length;i++) {
            		int max=a[0][i];
            		for(int j=0;j<a[i].length;j++) {
            			if(a[j][i]>max) {
            				max=a[j][i];
            			}
            			System.out.print(a[i][j]+" ");
            		}
            		System.out.print("  = "+max);
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
		Max_Num_Column l=new Max_Num_Column();
		l.column_Max(a);
		
	}
}
	



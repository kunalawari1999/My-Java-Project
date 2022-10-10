package com.days_21;

import java.util.Scanner;

public class Pattern_2D1 {
		 void pattern(int a[][]) {
	     	for(int i=0;i<a.length;i++) {
	     		for(int j=0;j<a[i].length;j++) {
	     			if(i==0 || j==0||j==a.length-1||i==a.length-1) {
	     			System.out.print(a[i][j]);
	     			}
	     			else {
	     				System.out.print(" ");
	     			}
	     		}
	     		System.out.println();
	     	}
	     }

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4},{3,4,5,6},{4,6,7,8,},{3,5,6,7}};
	   Pattern_2D1 l=new Pattern_2D1();
		l.pattern(a);
		
	}
	}

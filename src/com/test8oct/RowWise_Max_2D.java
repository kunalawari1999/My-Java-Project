package com.test8oct;

import java.util.Scanner;
public class RowWise_Max_2D {
	 public void row_Max(int a[][]) {
	    	
	    	for(int i=0;i<a.length;i++) {
	    		int max=0;
	    		for(int j=0;j<a[i].length;j++) {
	    			if(a[i][j]>max) {
	    				max=a[i][j];
	    			}
	    			System.out.print(a[i][j]+" ");
	    		}
	    		System.out.print("  = "+max);
	    		System.out.println();
	  	    	}
	    	
	    	
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array row length");
		int n=sc.nextInt();
		System.out.println("Enter array column length");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		RowWise_Max_2D p=new RowWise_Max_2D();
		p.row_Max(a);
	}

}

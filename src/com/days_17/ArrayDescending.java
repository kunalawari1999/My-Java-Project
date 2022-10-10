package com.days_17;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescending {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array length");
			int n=sc.nextInt();
			int[]a=new int[n];
			System.out.println("Enter array Elements");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				}
			}
			
	System.out.println(Arrays.toString(a));
		}

	}



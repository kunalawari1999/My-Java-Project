package com.test1oct;

import java.util.Arrays;
import java.util.Scanner;

public class SeperateZeroNonZero {
	
	 public void sepZero(int a[]) {
		 int j=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[j]==0) {
				 int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp; 
			 }
			 if((a[j]!=0)) {
				 j++;
			 }
		 }
		 System.out.println(Arrays.toString(a));
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		SeperateZeroNonZero s=new SeperateZeroNonZero();
		s.sepZero(a);

	}

}

package com.test1oct;

import java.util.Arrays;
import java.util.Scanner;

public class Replace0to1 {

	 public int[] replace(int []a) {
		for (int i=0;i<a.length;i++) {
			if(a[i]==0) {
				a[i]=1;
			}
		}
		return a;
	 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Replace0to1 k=new Replace0to1();
		int []b=k.replace(a);
		System.out.println(Arrays.toString(b));

	}

}

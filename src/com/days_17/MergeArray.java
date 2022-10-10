package com.days_17;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	int[] arrayMerge(int a[],int b[]) {
		int al=a.length;
		int bl=b.length;
        int cl=al+bl;
		
		int c[]=new int[cl];
		
		for (int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for (int i=0;i<b.length;i++) {
			c[al+i]=b[i];
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array length");
		int al=sc.nextInt();
		int a[]= new int[al];
		System.out.println("Enter 1st array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd  array length");
		int bl=sc.nextInt();
		int b[]= new int[bl];
		System.out.println("Enter 2n array element");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		
       MergeArray n=new MergeArray();
       int []m= n.arrayMerge(a,b);
       //System.out.println(Arrays.toString(n.arrayMerge(a,b)));
      for(int i=0;i<m.length;i++) {
    	  System.out.print(m[i]+" ");
      }
	}

}

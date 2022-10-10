package com.days_17;


import java.util.*;

public class IntReverse {
	
 static	int []  reverse(int []a ){
		
		for (int i=a.length-1;i>=0;i--) {
		   System.out.print(a[i]+" ");
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
		
		int b[]= IntReverse.reverse(a);
		
		System.out.println(Arrays.toString(b));

	}

}

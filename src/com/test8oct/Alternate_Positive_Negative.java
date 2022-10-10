package com.test8oct;

import java.util.Arrays;
import java.util.Scanner;

public class Alternate_Positive_Negative {
	
	public void alternate_Plus_Minus(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0) {
				count++;
			}
		}
		int b[]=new int[count];
	    int c[]=new int[a.length-count];
	    int arr_b=0;
	    int arr_c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0) {
				b[arr_b]=a[i];
				arr_b++;
			}
			else {
				c[arr_c]=a[i];
				arr_c++;
			}
		}
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(c));
		int e=0;
		int d[]=new int[a.length];
		for(int i=0;i<d.length;i++) {
			d[i]=b[e];
			d[++i]=c[e];
			e++;
		}
		System.out.println(Arrays.toString(d));
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
	     Alternate_Positive_Negative u=new Alternate_Positive_Negative();
	     u.alternate_Plus_Minus(a);

	}

}

package com.days_17;

import java.util.Arrays;
import java.util.Scanner;

public class DivideArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Array Element");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int even=0;
		
	   for(int i=0;i<a.length;i++) {
		   if(a[i]%2==0) {
			   even++;
		   }
	   }
	   int b[]=new int[even];
	   int c[]=new int[a.length-even];
	   int j=0;
	   int k=0;
	   for(int i=0;i<a.length;i++) {
		   if(a[i]%2==0) {
				 b[j]=a[i];
				 j++;
			   }
		   else {
			  
				   c[k]=a[i];
				   k++;
			   }
		   }
	   System.out.println("Even = "+ Arrays.toString(b));
	   System.out.println("Odd = "+Arrays.toString(c));
	   
        
	   System.out.print("Even=");
	   for(int i=0;i<b.length;i++) {
		   System.out.print(b[i]+" ");
	   }
	   System.out.println("");
	   System.out.print("Odd=");
	   for(int i=0;i<b.length;i++) {
		   System.out.print(c[i]+" ");
	   }
	}

}

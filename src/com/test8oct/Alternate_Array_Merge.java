package com.test8oct;

import java.util.Arrays;
import java.util.Scanner;

public class Alternate_Array_Merge {
	
	public static int[] merge_Alternate(int a[],int b[]) {
		int c[]=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<c.length;i++) {
				 c[i]=a[j];
				 c[++i]=b[j];
				 j++;
			 }
		
		return c;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
   System.out.println("Enter Array length");
   int n= sc.nextInt();
   System.out.println("Enter first array element");
  int a[]=new int[n];
  for(int i=0;i<a.length;i++) {
	  a[i]=sc.nextInt();
  }
  System.out.println("Enter second array element");
	  int b[]=new int[n];
	  for(int i=0;i<b.length;i++) {
		  b[i]=sc.nextInt();
  }
	  System.out.println(Arrays.toString(a));
	  System.out.println(Arrays.toString(b));
	  Alternate_Array_Merge g=new Alternate_Array_Merge();
	  int f []=g.merge_Alternate(a, b);
	  System.out.println("......Merged Array.......");
	  System.out.println(Arrays.toString(f));
  }

}

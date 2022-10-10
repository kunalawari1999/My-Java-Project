package com.test8oct;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyCount {
	
	  public void count_Frequency(int a[]) {
		  for(int i=0;i<a.length;i++) {
			  boolean isVisited=false;
			  int count=1;
			  for(int k=i-1;k>=0;k--) {
				  if(a[i]==a[k]) {
					  isVisited=true;
				  }
			  }
			  if(isVisited==false) {
				  for(int j=i+1;j<a.length;j++) {
					  if(a[i]==a[j]) {
						  count++;
					  }
				  }
				  System.out.println(a[i]+" "+count);
			  }
		  }
	  }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
 FrequencyCount f=new FrequencyCount();
 f.count_Frequency(a);
	}

}

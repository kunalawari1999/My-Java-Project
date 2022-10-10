package com.test1oct;

import java.util.Scanner;

public class MinFrequency {
	
	public static char minFreq(char a[]) {
		char min=a[0];
		for(int i=0;i<a.length;i++) {
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--) {
				if(a[i]==a[k]) {
					isvisited=true;
					break;
				}
			}
			if (isvisited==false) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					
					}
				}
				//System.out.println(a[i]+" "+count);
				for(int n=0;n<a.length;n++) {
					if(min<count) {
						min=a[i];
					}
				}
			}
		}
		System.out.println(min);
		return min;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		char a[]=new char[n];
	   System.out.println("Enter array element");
	   for(int i=0;i<a.length;i++) {
		  a[i]=sc.next().charAt(0);
	   }
	  int d=  MinFrequency.minFreq(a);
	  System.out.println(d);

	}

}

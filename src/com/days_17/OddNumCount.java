package com.days_17;

import java.util.Scanner;

public class OddNumCount {
 
	int oddCount(int[]d) {
		int count=0;
		int sum=0;
		for(int i=0;i<d.length;i++) {
			if(d[i]%2!=0) {
				sum=sum+d[i];
				count++;
			}
		}
		System.out.println("All odd numbers="+count);
		int avg=sum/count;
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int[]a= new int [n];
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		OddNumCount l=new OddNumCount();
		int g=l.oddCount(a);
		System.out.println("Average of odd number = "+g);
	}

}

package com.days_20;

import java.util.*;

public class OddPositionAvg {
	
	static float  avgOddPOsition(int a[]) {
		float count=0;
		float sum=0;
		for(int i=1;i<a.length;i+=2) {
			sum+=a[i];
			count++;
		}
		System.out.println(" sum="+sum);
		System.out.println(" count="+count);
		float avg= sum/count;
		return avg;
		
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
		System.out.println("Avg of odd position num="+OddPositionAvg.avgOddPOsition(a));

	}

}

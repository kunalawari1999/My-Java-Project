package com.test1oct;

import java.util.Scanner;

public class RemoveDuplicate {
	
	public static void removeduplicates(int a[]) {
		int []d=new int[20];
		int m=0;
		int count =0;
		for(int i=0;i<a.length;i++) {
			boolean flag=false;
			for(int k=i-1;k>=0;k--) {
				if(a[i]==a[k]) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						break;
					}
				}
				count++;
				d[m]=a[i];
				m++;
			}
		}
		//System.out.println(count);
		for(int i=0;i<m;i++) {
			System.out.println(d[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter array Element") ;
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		removeduplicates(a);

	}

}

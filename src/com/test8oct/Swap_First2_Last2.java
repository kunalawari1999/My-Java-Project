package com.test8oct;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_First2_Last2 {

	public void change_First2_Last2(int a[]) {
		int temp1=a[0];
		a[0]=a[a.length-2];
		int temp2=a[1];
		a[1]=a[a.length-1];
		a[a.length-2]=temp1;                       //Swap first 2 num with last 2 num
		a[a.length-1]=temp2;
		System.out.println("........After Swap last 2 with first 2........");
		System.out.println(Arrays.toString(a));
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
	System.out.println(Arrays.toString(a));
	Swap_First2_Last2 k=new Swap_First2_Last2();
	k.change_First2_Last2(a);

	}

}

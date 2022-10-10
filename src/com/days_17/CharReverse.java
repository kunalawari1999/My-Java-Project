package com.days_17;

import java.util.Scanner;

public class CharReverse {
	void reverse(char []a) {
		for(int i=(a.length-1);i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		char[]a=new char[n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.next().charAt(0);
		}
		CharReverse r=new CharReverse();
		r.reverse(a);

	}

}

package com.days_17;

import java.util.Scanner;

public class CharArrayDemo {
	
	void skipChar(char []a) {
		for(int i=0;i<a.length;i++) {
			if(i>=0) {
				System.out.print((char)(a[i]+2)+" ");
			}
			
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
		CharArrayDemo r=new CharArrayDemo();
		r.skipChar(a);
		//System.out.print(Arrays.toString(a));

	}

}

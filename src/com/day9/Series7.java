package com.day9;

import java.util.Scanner;

public class Series7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter number of term in series ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
       int result=i*i-1;
	
	System.out.print(result+",");
	}
	}

}

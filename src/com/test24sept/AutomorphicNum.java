package com.test24sept;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter n th ternm to check automorphic number ");
		int num=sc.nextInt();
     for(int i=1;i<=num;i++) {
    	 int sqr=i*i;
    	 String s=Integer.toString(i);
    	 String s1=Integer.toString(sqr);
    	 if(s1.endsWith(s)) {
    		 System.out.println(s);
    	 }
     }
	}

}

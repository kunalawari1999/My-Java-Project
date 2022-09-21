package com.day9;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int square=num*num;
		int squarecopy=square;
		while(num!=0) {
			if(num%10!=square%10) {
				System.out.println("Number is not Automorphic");
				break;
			}
			num=num/10;
		   square=square/10;
		}
		if(num==0) {
			System.out.println("Number is Automorphic");
		}
		
		System.out.println("Square of number is "+squarecopy);

	}

}

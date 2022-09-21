package com.day8;

import java.util.Scanner;

public class TrimorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int cube=num*num*num;
		int cubecopy=cube;
		while(num!=0) {
			if(num%10!=cube%10) {
				System.out.println("Number is not Trimorphic");
				break;
			}
			num=num/10;
		   cube=cube/10;
		}
		if(num==0) {
			System.out.println("Number is Trimorphic");
		}
		
		System.out.println("Cube of number is "+cubecopy);
		}

	}



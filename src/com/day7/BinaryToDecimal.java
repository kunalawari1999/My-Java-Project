package com.day7;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		boolean isBinary=true;
		int copy=num;
		int r;
		while(num!=0) {
			r=num%10;
			if(r>1||r<0) {
				isBinary=false;
				break;
				
			}
			num=num/10;
		}
		if(isBinary==true) {
			System.out.println("Binary Number");
			num=copy;
			int p=0;
			int sum=0;
		
			while(num>0) {
				int digit=num%10;
				int power=(int)(Math.pow(2,p));
				int multi=power*digit;
				sum=sum+multi;
				p++;
				num=num/10;
			}
		
			System.out.println(sum);
		}

	}

}

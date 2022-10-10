package com.test24sept;

import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		Boolean isprime=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isprime=true;
				break;
			}
		}
		if(isprime==true) {
			System.out.println("not Prime");
		}
		else {
			System.out.println(" prime");
		}
		
		}
	}



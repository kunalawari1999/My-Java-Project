package com.days_11;

import java.util.Scanner;

public class PowerOf3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
	
		for(int i=1;i<=10;i++) {
			 int power= (int)Math.pow(3, i);
		
			if(power==num) {
				System.out.println("Number is power of 3 ");
				break;
			}
			else {
				System.out.println("Num is not power of 3");
			}
			
			}
		

	}

}

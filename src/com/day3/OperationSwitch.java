package com.day3;

import java.util.Scanner;

public class OperationSwitch {

	public static void main(String[] args) {
		System.out.println("1.Area of Circle \n 2.Area Of Triangle \n 3. Area Of Rectangle");
		System.out.println("Enter number");
		Scanner sc=new Scanner (System.in);
		int num =sc.nextInt();
		double PI=3.14;
		
		switch(num){
			case 1 :System.out.println("Enter Parameters");
				float r=sc.nextFloat();
			System.out.println("Area of Circle is "+ (PI*r*r));
			break;
			case 2 : System.out.println("Enter Parameters");
				float b=sc.nextFloat(),h=sc.nextFloat();
			System.out.println("Area of Triangle "+(0.5*b*h));
			break;
			case 3 :System.out.println("Enter Parameters");
				float l=sc.nextFloat(),s=sc.nextFloat();
			System.out.println("Area of Rectangle "+(l*s));
			default :
				System.out.println("Enter valid Input ");
				
		}

	}

}

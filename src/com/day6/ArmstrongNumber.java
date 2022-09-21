package com.day6;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int num1=num;
		int cube=0;
		
		while(num>0&&num<1000) {
			int r=num%10;
			cube=cube+r*r*r;
			num=num/10;
			
		}
		if(num1==cube) {
			System.out.println("Number Is armstrong");
		}
		else {
			System.out.println("Number is not armstrong");
		}
		

	}

}

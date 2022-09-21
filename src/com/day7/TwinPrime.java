package com.day7;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number ");
int num1=sc.nextInt();
int count=0;
System.out.println("Enter Second Number");
int num2=sc.nextInt();
for(int i=2;i<=num1/2;i++) {
	if(num1%i==0) {
		for(int j=2;j<=num2/2;j++) {
			if(num2%i==0) {
		
		count++;
		break;
			}
	}
	
}
if(count==0 &&(num2-num1==2||num2-num1==-2)) {
	System.out.println("Number are twin  prime");
}
else {
	System.out.println("Number is not twin prime");
}
	}

	}
	}

package com.day5;
import java.util.Scanner;
public class Sum1To10 {

	public static void main(String[] args) {
	  int i;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Number");
	  int num=sc.nextInt();
	  int sum=0;
	  for(i=1;i<=num;i++) {
		  sum=sum+i;
	  }
	  System.out.println("Sum of 1 to "+(i-1)+" is = "+ sum);

	}

}


//Take input from user and display sum of all number from 1 to user enter input.
package com.day5;
import java.util.Scanner;
public class AverageOfDigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in) ;
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		int total=0;
		int count=0;
		
		while(num>1) {
			int r=num%10;
			total=total+r;
			count=count+1;
			num=num/10;
			
			
		}
		System.out.println("Total of digits in given number is "+total);
		double average;
		average=total/count;
		System.out.println("The average for given number digit is "+average );
		
		
		}

	}



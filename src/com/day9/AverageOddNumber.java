package com.day9;
import java.util.Scanner;
public class AverageOddNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0,count=0;
		while(num>0) {
			int r=num%10;
			if(r%2!=0) {
			sum=sum+r;
			count++;
			}
			num=num/10;
		
		}
		System.out.println("Average of odd digits in number is "+ sum/count);
		

	}

}

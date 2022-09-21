package com.day9;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;

		while(num>0) {
			int r=num%10;
			if(r==0) {
				
				count++;
				break;
			}
				num=num/10;	
			}
			//System.out.println(count);
		if(count!=0) {
			System.out.println("Number is duck number");
			
		}
		else {
			System.out.println("Num is not duck number");
		
		}
			
				
			}
		
		}

	



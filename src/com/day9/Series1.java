package com.day9;
import java.util.Scanner;
public class Series1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter term ");
		int num=sc.nextInt();
		for(int i=1; i<=num;i++) {
			System.out.print(" "+(i*i+1));
		}
		
		
	}

}

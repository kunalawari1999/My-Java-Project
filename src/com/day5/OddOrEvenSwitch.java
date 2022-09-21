package com.day5;
import java.util.Scanner;
public class OddOrEvenSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		int ans=num%2;
		switch(ans) {
		case 0:System.out.println("Even");
		break;
		default:System.out.println("Odd");
		}

	}

}

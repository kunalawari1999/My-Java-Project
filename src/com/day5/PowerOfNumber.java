package com.day5;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Base ");
		int base=sc.nextInt();
		System.out.println("Enter Expo ");
		int expo=sc.nextInt();
		int power=1;
		for(int i=1;i<=expo;i++) {
			power=power*base;
		}
		System.out.println(power);

	}

}

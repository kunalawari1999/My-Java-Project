package com.day3;

import java.util.Scanner;

public class MeAndFriendAge {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your age ");
	int yage=sc.nextInt();
	System.out.println("Enter your friend age ");
	int fage = sc.nextInt();
	
	if(yage>fage && yage<=100 && fage <=100) {
		System.out.println("Hii");
	}
	else if(yage<fage  && yage<=100 && fage <=100) {
		System.out.println("Hello");
	}
	else if (yage==fage && yage<=100 && fage<=100) {
		System.out.println("Hii Hello");
	}
	else {
		System.out.println("Enter Valid Age ");
	}
	

	}

}

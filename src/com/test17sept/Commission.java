package com.test17sept;

import java.util.Scanner;

public class Commission {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sale price");
		int sale=sc.nextInt();
		double comm=(sale>15000)?(sale*0.05):0;
     System.out.println("Commission ="+comm);
	}

}

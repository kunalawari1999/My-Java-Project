
package com.day2;

import java.util.Scanner;

public class EligibilityCriteria {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter passout Year");
		int yr=sc.nextInt();
		System.out.println("Enter percentage");
		double per=sc.nextDouble();
		if (yr==2022) {
			if(per>=60&&per<=100) {
				System.out.println("Select For Further Process");
			}
			else {
				System.out.println("Not applicable - % is less");
			}
			
		}
		else {
			System.out.println("Rejected - passout year not match ");
		}

	}

}

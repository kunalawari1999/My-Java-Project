package com.day3;
import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Basic Salary");
		double bsal=sc.nextDouble();
		
		if (bsal<=10000) {
			System.out.println("Gross Salary Is "+((bsal*0.20)+(bsal*0.80)+bsal));
		}
		else if (bsal>10000 && bsal <=20000) {
			System.out.println ("Gross Salary Is "+((bsal*0.25)+(bsal*0.90)+bsal));
		}
		else if (bsal>20000) {
			System.out.println("Gross Salary Is "+((bsal*0.30)+(bsal*0.95)+bsal));
		}
	}

}

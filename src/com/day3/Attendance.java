package com.day3;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Total No. Of Lecture ");
		double tlec=sc.nextInt();
		System.out.println("Enter Lecture attended by you ");
		double alec = sc.nextInt();
		
		double per=(alec/tlec)*100 ;
		System.out.println("Your attendance is "+per+"%");
		
		if (per>=75 && per <=100) {
			System.out.println("Allowed For Exam ");
		}
		else if (per<75) {
			System.out.println("Not Allowed For Exam ");
		}
		else {
			System.out.println("Please Enter Valid Attended Lecture ");
		}

	}

}

package com.test17sept;

import java.util.Scanner;

public class WorkArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your gerder m or f ");
		char gender=sc.next().charAt(0);
		System.out.println("Enter your marital status y or n ");
		char mstat=sc.next().charAt(0);
		
		if(age>=20&&age<=60) {
			if(age<=40&&gender=='m') {
				System.out.println("Employee can work anywhere");
			}
			else if(age>40&&gender=='m') {
				System.out.println("Employee only work in urban area");
			}
			else {
				System.out.println("Employee only work in urban area");
			}
		}
		else {
			System.out.println("Enter valid employee age");
		}
		

	}

}

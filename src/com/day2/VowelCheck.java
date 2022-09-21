package com.day2;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter letter");
		char ch=sc.next().charAt(0);
		
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		
 System.out.println("The given letter is Vowel");
	}
		else {
			System.out.println("The given letter is Consonent");
		}

}}

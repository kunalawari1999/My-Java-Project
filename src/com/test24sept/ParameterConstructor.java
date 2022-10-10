package com.test24sept;
import java.util.*;
public class ParameterConstructor {

	ParameterConstructor(int a) {
		 System.out.println("Square of given number = "+(a*a));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
	ParameterConstructor a=new ParameterConstructor(num);

	}

}

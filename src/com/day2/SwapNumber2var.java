package com.day2;
import java.util.*;
public class SwapNumber2var {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num 1");
		int x=sc.nextInt();
		System.out.println("Enter Num 2");
		int y=sc.nextInt();
		System.out.println("x="+x+"\ny="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x+"\ny="+y);

	}

}

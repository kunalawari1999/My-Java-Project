package com.day2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter num1 ");
      int num1=sc.nextInt();
      System.out.println("Enter num2");
      int num2=sc.nextInt();
      System.out.println("Enter operation");
      
      char ch=sc.next().charAt(0);
      
      switch(ch) {
      case '+':System.out.println(num1+num2);
      break;
      case '-' : System.out.println(num1-num2);
      break;
      case '*' :System.out.println(num1*num2);
      break;
      case'/':System.out.println(num1/num2);
      break;
      default :System.out.println("Invalid");
      }
      
      

	}

}

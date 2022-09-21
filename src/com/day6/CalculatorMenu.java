package com.day6;
import java.util.Scanner;
public class CalculatorMenu {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int a,b,c ;
	char ch;
	do {
	System.out.println("Enter Operation \n 1.Addition \n 2.Substration \n 3.Multiplication \n 4.Division");
	System.out.println("Enter Number 1");
	 a=sc.nextInt();
	System.out.println("Enter Number 2");
	 b=sc.nextInt();
	System.out.println("Enter Operation ");
	int num=sc.nextInt();
	
	
	switch (num) {
	case 1:System.out.println("Addition "+(a+b));
	break;
	case 2:System.out.println("Substraction is "+(a-b));
	break;
	case 3:System.out.println("Multiplication "+(a*b));
	break;
	case 4:System.out.println((a/b));
	break;
	default:System.out.println("Enter Valid Operation");
	
	}
	
	System.out.println("Do you want continue.....");
	ch=sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');
	
	System.out.println("Ok You done with your calculations...");
	
	

}
}

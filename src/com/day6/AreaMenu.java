package com.day6;
import java.util.Scanner;
public class AreaMenu {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	char ch ;
	do {
	System.out.println(" 1.Area Of triangle \n 2.Area of circle \n 3.Area of square \n 4.Area of rectangle");
	System.out.println("Please Enter your area choice from above");
	int area=sc.nextInt();
	
	switch(area){
	case 1: int base,height;
	System.out.println("Enter Base");
	      base=sc.nextInt();
	      System.out.println("Enter Height");
	      height=sc.nextInt();
	      System.out.println("Area of triangle is "+(0.5*height*base));
	      break;
	case 2: double PI=3.14,rad;
	System.out.println("Enter Radius");
	        rad=sc.nextDouble();
	        System.out.println("Area of circle is "+(PI*rad*rad));
	        break;
	case 3 : int side ;
	System.out.println("Enter side");
	 side=sc.nextInt();
	 System.out.println("Area of square is "+(side*side));
	 break;
	case 4 : int length,breadth;
	System.out.println("Enter Length");
	length=sc.nextInt();
	 System.out.println("Enter Breadth");
	breadth=sc.nextInt();
	System.out.println("Area of rectangle is "+(length*breadth));
	break;
	
	default : System.out.println("Please choose valid area option ");
	}
	System.out.println("Enter y or Y to calculate area again ");
	ch=sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');
	System.out.println("Okay you done with req. areas..");
	}
	}



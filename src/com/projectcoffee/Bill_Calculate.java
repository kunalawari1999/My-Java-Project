package com.projectcoffee;

import java.util.Scanner;

public class Bill_Calculate extends Display_Menu{
		
	public static void bill() {
		int total=0;
		int o = 0;
		int repeat;
	do {
		System.out.println("");
		show_Menu();
		int sum=total;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter menu number");
        int n=sc.nextInt();
        System.out.println("Enter Quantity");
        int b= sc.nextInt();
		o++;
		switch(n) {
		case 1:
			total=50*b;
			if(o>1) {
				total=total+sum;
			}
				break;
		case 2:
		 total=70*b;
		  if(o>1) {
		 total=total+sum;
				}
			    break;
		case 3:
			total=100*b;
			if(o>1) {
				total=total+sum;
			}
				break;
		case 4:
			total=150*b;
			if(o>1) {
				total=total+sum;
			}
				break;	
		case 5:
			total=200*b;
			if(o>1) {
				total=total+sum;
			}
				break;
		case 6:
			total=100*b;
			if(o>1) {
				total=total+sum;
			}
				break;
		case 7:
			total=100*b;
			if(o>1) {
				total=total+sum;
			}
				break;
		case 8:
			total=200*b;
			if(o>1) {
				total=total+sum;
			}
				break;
		case 9:
			total=200*b;
			if(o>1) {
				total=total+sum;
			}
			break;
		case 10:
			total=100*b;
			if(o>1) {
				total=total+sum;
			}
				
				break;
			}
		System.out.println("Do tou want Continue press 1 for yes or 2 for bill");
//		Scanner sc=new Scanner(System.in);
		 repeat=sc.nextInt();
	}while(repeat==1);
	System.out.println("Total Bill="+total);
	

	}	
	

	public static void main(String[] args) {
//		show_Menu();
//		Scanner sc=new Scanner(System.in);
//        System.out.println("Enter menu number");
//        int n=sc.nextInt();
//        System.out.println("Enter Quantity");
//        int m= sc.nextInt();
        bill();
	}

}

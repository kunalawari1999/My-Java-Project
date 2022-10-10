package com.test24sept;
import java.util.*;
public class LoanCalculator {
	public int houseLoan(int a,int amt) {
		System.out.println("House Loan");
		int loan=amt*(100+a);
		return loan;
	}
	public int commercialLoan(int a,int b,int amt) {
		System.out.println("Commercial Loan");
		int loan=amt*(a+b+100);
		return loan;
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Principal Amount");
     int amt=sc.nextInt();
     System.out.println("Enter Loan Type");
     char type=sc.next().charAt(0);
     LoanCalculator l=new LoanCalculator();
     if(type=='h'||type=='H') {
    	 System.out.println("Enter rate value ");
    	 int a=sc.nextInt();
    	System.out.println("Total House Loan= "+l.houseLoan(a, amt));
     }
     else if (type=='c'||type=='C') {
    	 System.out.println("Enter rate 1");
    	 int k=sc.nextInt();
    	 System.out.println("Enter rate 2");
    	 int j=sc.nextInt();
        System.out.println( "Total Commercial Loan ="+l.commercialLoan(k, j, amt)) ;
     }
     
	}

}

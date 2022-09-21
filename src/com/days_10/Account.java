package com.days_10;

import java.util.Scanner;

public class Account {
	int accNo;
	String accType;
	double balance;
	double amount;
	
	public void acceptDetails(int no,String type,double bal) {
		this.accNo=no;
		this.accType=type;
		this.balance=bal;
		
	}
	public void display() {
		System.out.println("Acc no-"+accNo+"\n Acc Type-"+accType+"\n Acc Bal-"+balance);
	}
	public void deposite() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to be deposite");
	    amount =sc.nextDouble();
	}
	public void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to be Withdraw");
		amount=sc.nextDouble();
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Withdrawn amount is="+amount);
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	}
	public void balance() {
		System.out.println("Balance in account is="+balance);
	}

	public static void main(String[] args) {
		Account a =new Account();
	    a.acceptDetails(555, "Current",50000);
	    a.display();
	    a.withdraw();
	    a.balance();

	}

}

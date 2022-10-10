package com.test24sept;

import java.util.Scanner;

class CreditCard{
	String type;

 CreditCard(String type){
	 this.type="Credit";
 }
}
class DebitCard{
	
String type;

DebitCard(String type){
	this.type="Debit";
}
}
public class Shopping {
	void doTransaction(CreditCard c) {
	System.out.println("You got 15 % discount on bill on credit transaction ");	
	}
	void doTransaction( DebitCard d) {
	System.out.println("No discount on bill on debit card transaction");	
	}

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter card type");
      System.out.println("Press-1 for Debit Card\nPress-2 for Credit Card");
     // String type=sc.next();
      int a =sc.nextInt();
      Shopping n=new Shopping();
      if(a==1) {
      n.doTransaction(new DebitCard("d"));
       }
      else if(a==2) {
    	n.doTransaction(new CreditCard("c"));  
     }
      
	}
}

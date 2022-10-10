package com.days_15;

public class FinalOverload {
	
	public final void showdetails() {
		System.out.println("This is final ShowDetail Method");
	}
	public final int showdetails(int a) {
		System.out.println("This is final method with int return");
		return a;
	}
	 final void showdetails(int a,String b) {
		System.out.println("Final with int and string"); 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

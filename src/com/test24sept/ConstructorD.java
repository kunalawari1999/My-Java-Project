package com.test24sept;

public class ConstructorD {
	ConstructorD (int a) {
		System.out.println("1");
	}
	ConstructorD(){
		System.out.println("2");
	}
	ConstructorD(String a){
	System.out.println(a);	
	}

	public static void main(String[] args) {
		ConstructorD a=new ConstructorD(5);
		ConstructorD b=new ConstructorD();
		ConstructorD c=new ConstructorD("111");
		

	}

}

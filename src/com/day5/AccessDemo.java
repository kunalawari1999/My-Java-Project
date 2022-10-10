package com.day5;

public class AccessDemo {
	 private int a=3;
	  int b=5;
	 protected int c=7;
	 public int d=9;
	static int h=10;

	public static void main(String[] args) {
		AccessDemo z=new AccessDemo();
	 System.out.println("a="+z.a+" b="+z.b+" c="+z.c+" d="+z.d);
	 System.out.println(AccessDemo.h);
	}

}

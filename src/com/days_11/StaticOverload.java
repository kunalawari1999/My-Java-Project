package com.days_11;

public class StaticOverload {
	 public static void opration (int a,int b) {
		 System.out.println("add'n"+(a+b));
	 }
public static void opration(int a,float b) {
	System.out.println("add="+(a+b));
}
public static void opration(float a,int b) {
	System.out.println("addn="+(a+b));
}
public static void opration(float a,float b) {
	System.out.println("add="+(a+b));
}
	public static void main(String[] args) {
		StaticOverload a=new StaticOverload();
		a.opration(5,37);
		a.opration(7,9.7f);
		a.opration(5.3f,7);
		a.opration(9.7f,5.3f);
	}

}

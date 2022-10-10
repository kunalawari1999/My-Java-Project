package com.days_14;

class A {
 public void method() {
	 System.out.println("Welcome");
 }
}
class B extends A {
	
	@Override
	public void method() {
		System.out.println("Wlc");
	}
}
public class Overridedemo {

	public static void main(String[] args) {

		
	 A m=new A();
	 m.method();
	 
      B n=new B();
      n.method();
	}

}

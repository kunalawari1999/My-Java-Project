package com.days_11;

public class ArithmaticOverloading {
	void operation(int a,int b) {
		System.out.println("Addition of a & b is "+(a+b));
	}
    void operation (int a,float b) {
    	System.out.println("Substraction of a & b is "+(a-b));
    }
    void operation (float a,int b) {
    	System.out.println("Multiplication of a & b is "+(a*b));
    }
    void operation (float a,float b) {
    	System.out.println("Division of a & b "+(a/b));
    }
	public static void main(String[] args) {
		ArithmaticOverloading a=new ArithmaticOverloading();
		a.operation(5,9);
		ArithmaticOverloading b=new ArithmaticOverloading();
		b.operation(35,7.9f);
		ArithmaticOverloading c=new ArithmaticOverloading();
		c.operation(5.6f,21);
		ArithmaticOverloading d=new ArithmaticOverloading();
		d.operation(5.7f,8.4f);
		

	}

}

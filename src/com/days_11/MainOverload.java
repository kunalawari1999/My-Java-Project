package com.days_11;

public class MainOverload {

		 public static void main (int a,int b) {
			 System.out.println("add'n"+(a+b));
		 }
	public static void main(int a,float b) {
		System.out.println("add="+(a+b));
	}
	public static void main(float a,int b) {
		System.out.println("addn="+(a+b));
	}
	public static void main(float a,float b) {
		System.out.println("add="+(a+b));
	}
	public static void main(String[] args) {
        MainOverload a=new MainOverload();
        a.main(5,9);
        a.main(5,9.3f);
        a.main(6f,5);
        a.main(8f,5f);

	}

}

package com.days_14;
class Fruits{
	String taste="Sweet";
	void show() {
		System.out.println("Fruit Super Class ");
	}
}
class Banana extends Fruits{
	String taste="sour";
	
	void showB() {
		System.out.println("Banana taste ="+super.taste);
	}
	
}
class Grapes extends Fruits {
	void show() {
		System.out.println("Grapes");
		super.show();
	}	
}

public class Super {
	

	public static void main(String[] args) {
		Banana b=new Banana();
		b.showB();
		Grapes g=new Grapes();
         g.show();
	}

}

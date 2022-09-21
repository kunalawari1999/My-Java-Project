package com.days_14;
class Opration{
	String name;
}
class Add extends Opration{
	void showA() {
	name="Add";
	int a=9;
	int b=75;
	int add=a+b;
	System.out.println("name= "+name+" a= "+a+" b= "+b+" add= "+add);
	}
}
class Substract extends Opration{
	void showS() {
    name="Substract";
	int x=10;
	int y=7;
	int substract=x+y;
	System.out.println("name= "+name+" x= "+x+" y= "+y+" Substraction= "+substract);
	}
}
class Multiplication extends Opration {
	
	void showM() {
		name="Multiplication";
		int p=2,q=3;
	   int multi=p*q;
	   System.out.println("name= "+name+" p= "+p+" q= "+q+" Multiplication= "+multi);
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		Add a=new Add();
		a.showA();
		Substract b=new Substract();
		b.showS();
		Multiplication c=new Multiplication();
		c.showM();
	}

}

package com.days_15;

abstract class SuperDemo{
    String a="parent";
	
	abstract void show() ;
	
	public void demoMethod() {
		System.out.println("This is parent class method ");
	}
	
	SuperDemo(int a){
		System.out.println("Constructor of SuperDemo ");
	}
}
   class SuperUses extends SuperDemo{
	   String a="Child";
	   @Override
	   void show() {
		   //super.demoMethod();
		   System.out.println("This is Override Method");
		   super.demoMethod();
	   }
	   
	   SuperUses(){
		   super(5);
		   System.out.println("Constructor of SuperUses + + "+super.a );
	   }
   }

public class AbstractSuperDemo {

	public static void main(String[] args) {
		SuperUses a= new SuperUses();
		a.show();
	}
}

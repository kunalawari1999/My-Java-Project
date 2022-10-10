package com.days_17;

 class AB extends Demo{
	
	 int b=50;
	 static {
		 AB c=new AB();
		 int a=9;
		 int m=98;
		 System.out.println(a+m+c.b);
	 }
	 public static void main(String[] args) {
		 System.out.println("A");
	 }
}
public class Demo  {
	
	

	public static void main(String[] args) {
	System.out.println("Demo");
	AB.main(args);
	System.out.println("ABAB");
	}

}

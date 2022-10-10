package com.test1oct;

public class MultipleOf3and5 {
 
	  void showMultiple() {
		  int buzz=0;
		  int fizz=0;
		  int buzzfizz=0;
		  for(int i=1;i<=50;i++) {
			   if(i%3==0&&i%5==0) {
				  System.out.println("BuzzFizz");
				  buzzfizz++;
			  }
			   else if(i%3==0) {
				  System.out.println("Buzz");
				  buzz++;
			  }
			  else if(i%5==0) {
				  System.out.println("Fizz");
				  fizz++;
			  }
			  
			  else
			  System.out.println(i);
		  }
		  System.out.println(".......................................");
		  System.out.println("Buzz="+buzz);
		  System.out.println("Fizz="+fizz);
		  System.out.println("BuzzFizz="+buzzfizz);
	  }
	public static void main(String[] args) {
		MultipleOf3and5 a=new MultipleOf3and5();
		a.showMultiple();
		

	}

}

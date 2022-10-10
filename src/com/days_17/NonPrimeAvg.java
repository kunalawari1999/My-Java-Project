package com.days_17;

import java.util.Scanner;

   

public class NonPrimeAvg {
	
  int nonPrimeAvg(int a[]) {
	  int sum=0;
	  int count=0;
	  for (int i=0;i<a.length;i++) {
		  Boolean isPrime=false;
		  for(int j=2;j<a.length;j++) {
			  if (a[i]%j==0) {
				  isPrime=true;
				  count++;
				  break;
			  }
			  
		  }
		  if(isPrime==true) {
			  sum=sum+a[i];
		  }
		  }
	  System.out.println("Sum="+sum);
	  System.out.println("count="+count);
	  int avg=(sum/count);
	 // System.out.println("Count "+count);
	  return avg;
  }
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter class length");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter array values");
	for (int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
   NonPrimeAvg b=new NonPrimeAvg();
  System.out.println("Avg of non prime num = "+b.nonPrimeAvg(a));
   }

}

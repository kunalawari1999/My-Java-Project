package com.days_15;
import java.util.*;
interface FactSum{
	int sumOfFactor(int n);
}

class SumOfFactorial implements FactSum {
	
	public int sumOfFactor(int a) {
		int sum=0;
		for (int i=1;i<=a;i++) {
			if(a%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class InterfaceDemo {


	public static void main(String[] args) {
	SumOfFactorial f=new SumOfFactorial();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	int r=f.sumOfFactor(num);
	System.out.println("Sum of Factorial = "+r);
	}
}


/*Create interface which contain abstract method which has one int type parameter and int type 
 return give implementation to method in child class and sum of factor of given num. */
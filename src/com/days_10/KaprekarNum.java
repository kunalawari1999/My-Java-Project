package com.days_10;
import java.util.*;
public class KaprekarNum {

	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int i,d=0,a,s=0,r,l;
			System.out.println("Enter an integer:");
			a=sc.nextInt();
			for(i=a;i>0;i=i/10)
			{
				d++;
			}
			s=a*a;
			r=s/(int)Math.pow(10,d);
			l=s%(int)Math.pow(10,d);
			if(r+l==a)
			System.out.println("Kaprekar Number");
			else
			System.out.println("Not a Kaprekar Number");
		
	}

}

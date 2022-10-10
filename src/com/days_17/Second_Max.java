package com.days_17;

import java.util.*;
public class Second_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int max=Integer.MIN_VALUE;
int second_max=Integer.MIN_VALUE;
System.out.println("Enter Array");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
System.out.println("Second Max");
for(int i=0;i<a.length;i++)
{
	if(a[i]>max)
	{
		second_max=max;
		max=a[i];
	}
	else if(a[i]>second_max && a[i]!=second_max)
	{
		second_max=a[i];
	}
}
System.out.println(second_max);
	}

}

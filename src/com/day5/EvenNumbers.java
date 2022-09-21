package com.day5;

public class EvenNumbers {

	public static void main(String[] args) {

		for(int i=1;i<=20;i++)
		{
if (i%2==0) {
	System.out.println(i);
	if(i%3==0) {
		break;
	}
}
	}
	}
}


//Loop break when number is divisible by 3
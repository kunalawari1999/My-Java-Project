package com.day7;

public class CountOddNum {

	public static void main(String[] args) {
		int count=0;
		for (int i=25;i>9;i--) {
			if(i%2!=0) {
				count++;
			}
		}
		System.out.println(count);

	}

}

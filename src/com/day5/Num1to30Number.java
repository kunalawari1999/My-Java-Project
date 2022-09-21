package com.day5;

public class Num1to30Number {

	public static void main(String[] args) {
		for(int i=1;i<=30;i++) {
			if(i%2==0||i%3==0||i%9==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}

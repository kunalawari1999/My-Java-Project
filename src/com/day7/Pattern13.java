package com.day7;

public class Pattern13 {

	public static void main(String[] args) {
		int a=1;
		int rim;
		for(int i=1;i<=5;i++) {
			a=a*10;
			rim=a/9;
			int j=rim*i;
			System.out.println(j);
		}

	}

}

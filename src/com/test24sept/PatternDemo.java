package com.test24sept;

public class PatternDemo {

	public static void main(String[] args) {
		int n=7;
		for (int i=1;i<=4;i++) {
			for (int k=n;k>i;k--) {
				System.out.print(" ");
			}
			for (int j=1;j<2*i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}

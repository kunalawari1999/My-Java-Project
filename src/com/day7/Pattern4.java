package com.day7;

public class Pattern4 {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++){
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=3;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}

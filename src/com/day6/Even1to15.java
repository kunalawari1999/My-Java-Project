package com.day6;

public class Even1to15 {

	public static void main(String[] args) {
		
		for(int i=1;i<=15;i++) {
			if(i%2==0) {
				System.out.println(i*i);
			}
			else {
				System.out.println(i);
			}
		}
	}

}
// If number is even then print its square & if number is odd print as it is between 1 to 15 
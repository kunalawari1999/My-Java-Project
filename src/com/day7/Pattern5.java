package com.day7;

public class Pattern5 {

	public static void main(String[] args) {
		 for (int i = 1; i <=5; i++)
	        {
	            for (int j=0; j>=i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= 5-i+1 ; k++)
	            {
	                System.out.print(k + " ");
	            }
	            System.out.println();
		}

	}

}

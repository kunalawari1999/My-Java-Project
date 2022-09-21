package com.day6;

public class PrimeNoAddition {

	public static void main(String[] args) {
		 int sum = 0;
           int i;
	        for(int num = 2; num <=20 ; num++) {

	            for(i = 2; i <= (num / 2); i++) {

	                if(num % i == 0) {
	                    i = num;
	                    break;
	                }
	            }
	            if(i != num) {
	                sum += num;            
	            }
	        }

	        System.out.println("Sum of all prime numbers upto 20 is = " + sum);
	    }

	

	}



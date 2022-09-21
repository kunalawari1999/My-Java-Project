package com.days_10;

import java.util.Scanner;

public class MobNoFreq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Mobile Number");
		long mob=sc.nextLong();
		int num0=0,num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0,num9=0;
		int count=0;
		long r=0;
    	while(mob>0) {
    	 r=mob%10;
    		count++;
    		if(r==0) {
    			num0++;
    		}
    		else if(r==1) {
    			num1++;
    		}
    		else if(r==2) {
    			num2++;
    		}
    		else if(r==3) {
    			num3++;
    		}
    		else if(r==4) {
    			num4++;
    		}
    		else if(r==5) {
    			num5++;
    		}
    		else if(r==6) {
    			num6++;
    		}
    		else if(r==7) {
    			num7++;
    		}
    		else if(r==8) {
    			num8++;
    		}
    		else if(r==9) {
    			num9++;
    		}
    		mob=mob/10;
    	}
    	
    	if(count==10) {
    	    System.out.println(count);
    		System.out.println("Frequency of 0 is "+num0);
    		System.out.println("Frequency of 1 is "+num1);
    		System.out.println("Frequency of 2 is "+num2);
    		System.out.println("Frequency of 3 is "+num3);
    		System.out.println("Frequency of 4 is "+num4);
    		System.out.println("Frequency of 5 is "+num5);
    		System.out.println("Frequency of 6 is "+num6);
    		System.out.println("Frequency of 7 is "+num7);
    		System.out.println("Frequency of 8 is "+num8);
    		System.out.println("Frequency of 9 is "+num9);
    	}
    	else {
    		System.out.println("Enter valid mobile number ");
    	}

		

	}

}

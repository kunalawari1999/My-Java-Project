
package com.days_11;

public class AvgPrime {
	
	public void prime(){
		float sum=0;
		float count =0;
	for(int num=1;num<=20;num++) {
		boolean isprime=true;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				 isprime=false;
				break;
			}
		}
		if(isprime==true) {
			count++;
			sum=sum+num;
		}
		}
	System.out.println("sum="+sum+" count="+count);
	System.out.println("Average of prime number between 1 to 20 is  "+(sum/count));
	}

	public static void main(String[] args) {
	
AvgPrime a=new AvgPrime();
a.prime();
//int b=a.prime();
//System.out.println(b);
	}

}

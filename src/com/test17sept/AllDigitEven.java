package com.test17sept;

public class AllDigitEven {

	public static void main(String[] args) {
	 for(int i=100;i<=400;i++) {
		 int copy=i;
		 int count=0;
		 
		 while(copy>0) {
			 int r=copy%10;
			 if(r%2==0) {
				 count++;
			 }
			 copy=copy/10;
		 }
	 
		 if(count==3) {
		 System.out.println(i);
		 }
	 } 
}
}

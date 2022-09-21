package com.days_10;

		public class FactorSum {

			int num;
			int sum;
			
			public void factSum(int n) {
				int num=n;
				for(int i=1;i<=num;i++) {
					if(num%i==0) {
						sum=sum+i;
						
					}
					
				}
				System.out.println("Sum of factor="+sum);
				
			}
			public static void main(String[] args) {
			FactorSum sum_Fact=new FactorSum();
			sum_Fact.factSum(40);
			

			}

		

		
	}



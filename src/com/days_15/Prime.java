package com.days_15;

import java.util.*;
class Prime {

public int sumPrime(int n){
int sum=0;
while(n>0){
for(int i=2;i<=n;i++){
 for(int j=1;j<=n;j++){
       if(j%i !=0){
      sum=sum+j;
   break;
}
}
}
}
return sum;

}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
int num=sc.nextInt();
Prime p=new Prime();
int pr=p.sumPrime(num);
System.out.println("Sum of prime num="+pr);

}


}

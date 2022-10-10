package com.day6;
import com.day5.*;                                         //fron package com.day5

public class AccessDemo3 {                                       

	public static void main(String[] args) {
	    AccessDemo n=new AccessDemo();
	   // System.out.println(n.a);
	    //System.out.println(n.b);
	    //System.out.println(n.c);
	    System.out.println(n.d);

	}
}

//a is private variable and b is default variable from package com.day5 and from class AccessDemo
//hence they are not access here .  c is protected and AccessDemo3 is not child class of AccessDemo
//hence c is not access here. d is public hence it is access.
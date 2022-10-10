package com.day6;
import com.day5.*;                                              //fron package com.day5

public class AccessDemo4 extends AccessDemo{

	public static void main(String[] args) {
		AccessDemo4 j=new AccessDemo4();
	//	System.out.println(j.a);
	//	System.out.println(j.b);
		System.out.println(j.c);
		System.out.println(j.d);
	}

}




//a is private variable and b is default variable from package com.day5 and from class AccessDemo
//hence they are not access here .  c is protected and AccessDemo4 is child class of AccessDemo
//hence c is access here.

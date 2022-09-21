package com.days_14;

class Mobiles{
	Mobiles(String name){
		System.out.println("Mob name= "+" "+name);
	}
}
class Android extends Mobiles{
	Android(){
		super("OnePlus");
		System.out.println();
	}
}

public class Super2 {

	public static void main(String[] args) {
		Android a=new Android();
		

	}

}

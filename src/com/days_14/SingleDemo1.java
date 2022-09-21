package com.days_14;
class Fruit {
	int weight =50;
}

class Mango extends Fruit{
	void show () {
		System.out.println("Mango has a "+weight+" weight");
	}
}

public class SingleDemo1 {
	
	

	public static void main(String[] args) {
		Mango m=new Mango();
		m.show();

	}

}

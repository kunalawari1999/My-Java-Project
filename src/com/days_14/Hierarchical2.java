package com.days_14;
class ElectronicDevice{
	String name;
	int price;
}
class Mobile extends ElectronicDevice{
	void mobileDetails(){
	name="Apple";
	price=100000;
	int ram=16;
	String model="Android";
	System.out.println("name = "+name+" price = "+price+" ram "+ram+" model = "+model);
}
}
class Laptop extends ElectronicDevice{
	void laptopDetails () {
		name="Lenovo";
		price=50000;
		int storage=1000;
		int ram=8;
		System.out.println("name = "+name+" price = "+price+" storage "+storage+" ram "+ram);
	}
}
public class Hierarchical2 {


	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.mobileDetails();
		Laptop l=new Laptop ();
		l.laptopDetails();

	}

}

package com.days_10;

public class Vehicle {
	int model;
	String name;
	float price;
	

	public static void main(String[] args) {
		Vehicle swift=new Vehicle();
		swift.model=54365;
		swift.name="SWIFT DZIRE";
		swift.price=500000f;
		
		System.out.println("Model no."+swift.model+" Model Name "+swift.name+"Model Price "+swift.price);
		
		Vehicle nexon=new Vehicle();
		nexon.model=74645;
		nexon.name="TATA NEXON";
		nexon.price=700000f;
		System.out.println("Model no."+nexon.model+" Model Name "+nexon.name+" Model price "+nexon.price);

	}

}

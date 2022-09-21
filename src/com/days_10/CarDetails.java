package com.days_10;

public class CarDetails {

	public static void main(String[] args) {
		Car cr=new Car();
		cr.SetModelNo(11);
		cr.SetName("SWIFT");
		cr.SetPrice(500000);
		cr.SetSpeed(120);
		
		System.out.println("Model no "+ cr.GetModelno());
		System.out.println("Name "+cr.GetName());
		System.out.println("Price "+cr.GetPrice());
		System.out.println("Speed "+cr.GetSpeed());
		

	}

}

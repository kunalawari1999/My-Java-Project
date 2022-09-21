package com.days_10;

public class Car {
	private int modelNo;
	private int price;
	private String name;
	private int speed;
	
	public void SetModelNo(int modelno) {
		this.modelNo=modelNo;
	}
	public void SetPrice(int price) {
		this.price=price;
	}
	public void SetName(String name) {
		this.name=name;
	}
   public void SetSpeed(int speed) {
	   this.speed=speed;
   }
   
   public int GetModelno() {
	   return modelNo;
   }
   public int GetPrice() {
	   return price;
   }
   public String GetName() {
	   return name;
   }
   public int GetSpeed() {
	   return speed;
   }
}

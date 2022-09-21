package com.days_10;

public class Shopping {
String purchaseItem;
int quantity;
int priceSingleItem;
int total;

 public void acceptDetails(String pItem,int quant,int pr) {
	 purchaseItem=pItem;
	 quantity=quant;
	 priceSingleItem=pr;
	 
 }
 public void calculateBill() {
	 if(quantity>0) {
		total=quantity*priceSingleItem; 
	 }
		else if(quantity==0) {
			System.out.println("Error");
	 }
		else {
			System.out.println("Invalid");
		}
 }
 public void displayBill() {
	 if(quantity>0) {
	 System.out.println("Item Name-"+purchaseItem+"\n Quantity-"+quantity+"\n Price per Item-"+priceSingleItem+"\n Total Bill-"+total);
 }
	 else {
		 System.out.println("Error ");
	 }
 }
	

	public static void main(String[] args) {
		Shopping shirt=new Shopping();
		 shirt.acceptDetails("Shirt", 300, 5);
		 shirt.calculateBill();
		 shirt.displayBill();
		 
		 
		 Shopping bag=new Shopping();
		 bag.acceptDetails("Bag",0, 500);
		 bag.displayBill();
		 
		

	}

}

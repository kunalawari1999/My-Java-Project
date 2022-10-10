package com.days_13;


	
	class Pen{
		int price;
		String colour;                                //Containment(Gtter Setter Method)
		String bName;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	public void setBName(String bName ) {
		this.bName=bName;
	}
	public int getPrice() {
		return price;
	}
	public String getColour() {
		return colour;
	}
	public String getBName() {
		return bName;                                     
	}
	}
	public class Bag {
		String bName;
		int price;
		Pen p;
	
	public void setBName(String bName) {
		this.bName=bName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setP(Pen p) {
		this.p=p;
	}
	public String getBName() {
		return bName;
	}
	public int getPrice() {
		return price ;
	}
	public Pen getP() {
		return p;
	}
	public static void main(String[] args) {
		Bag a=new Bag();
		a.setBName("American Tourist");
		a.setPrice(1000);
		a.setP(new Pen());
		a.getP().setPrice(50);
		a.getP().setColour("Green");
		a.getP().setBName("Trimax");
		
System.out.println("Bag Name="+a.getBName()+"\nbag price="+a.getPrice()+"\npen price="+a.getP().getPrice()+"\npen colour="+a.getP().getColour()+"\npen brand="+a.getP().getBName());
	}

}

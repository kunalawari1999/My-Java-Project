package com.days_13;
class Engine {
	 String type;
                                                   //Containment (Constructor method)
Engine(String type){
	this.type=type; 
}
public String toString() {
	 return type;
}
}
 class Gear {                                
	int g;

 Gear(int g){
	 this.g=g;
 }
 public String toString() {
	 return g+"";
 } 
 }
 
public class Car {
	int cmodel;
	float price;
	Engine eng;
	Gear gr;
	
	Car(int cmodel,float price,Engine eng,Gear gr){
		this.cmodel=cmodel;
		this.price=price;
	    this.eng=eng;
		this.gr=gr;
	}
	public String toString() {
		return cmodel+" "+price+" "+eng+" "+gr;
	}

	public static void main(String[] args) {
		
    Car c=new Car(555,50000f,new Engine("4 Stroke"),new Gear(5));
    System.out.println(c);
		
	}
}

package com.test1oct;
class Gear {
	String type;
	
	Gear(String type){
		this.type=type;
	}
	public String toString(){
		return type;
	}
}
class SubEngine{
	String subEngineType;
	
	SubEngine(String subEngineType){
		this.subEngineType=subEngineType;
	}
	public String toString() {
		return subEngineType;
	}
}
class Engine {
	int engineId;
	String lastenginecleandate;
	SubEngine subEng;
	
	Engine(int engineId,String lastenginecleandate,SubEngine subEng){
		this.engineId=engineId;
		this.lastenginecleandate=lastenginecleandate;
		this.subEng=subEng;
	}
	public String toString() {
		return engineId+" "+lastenginecleandate+" "+subEng;
	}
}
class Car{
	int carId;
	String carColor;
	Engine eng;
	Gear gr;
	
	Car(int carId,String carColor,Engine eng,Gear gr){
		this.carId=carId;
		this.carColor=carColor;
		this.eng=eng;
		this.gr=gr;
	}
	
	public String toString() {
		return carId+" "+carColor+" "+eng+" "+gr;
	}
}
public class ContainmentCar {

	public static void main(String[] args) {
Car c=new Car(111,"White",new Engine(222,"1 Oct 2022",new SubEngine("Auto")),new Gear("Multigear"));

System.out.println(c);
	}

}

/*There are four classes a) Car (carId, carcolor) b) Engine
(engineid ,lastenginecleandate) c) SubEngine (subenginetype)
d) Gear (type - auto manual)
Car has Engine, Engine has SubEngine, Car also has Gear
Create Object in Object (Containment) for above scenario*/

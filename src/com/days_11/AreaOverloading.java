package com.days_11;

public class AreaOverloading {
 public void Area(int r) {
	 double PI=3.14;
	 System.out.println("Area of circle="+(PI*r*r));
 }
 public void Area(int l,int b) {
	 System.out.println("Area of rectangle="+(l*b));
 }
 public void Area (int h,float b) {
	 System.out.println("Area of triangle="+(0.5*h*b));
 }

	public static void main(String[] args) {
		AreaOverloading a=new AreaOverloading();
		a.Area(5);
		AreaOverloading b=new AreaOverloading();
		b.Area(7,9);
		AreaOverloading c=new AreaOverloading();
		c.Area(4,7.0f);
		

	}

}

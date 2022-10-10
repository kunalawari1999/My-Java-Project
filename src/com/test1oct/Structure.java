package com.test1oct;
class Nib{
	private String materialType;
	private int width;
	
	public void setMaterialType(String materialType) {
		this.materialType=materialType;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public String getMaterialType() {
		return materialType;
	}
	public int getWidth() {
		return width;
	}
	
	public String toString() {
		return getMaterialType()+"  "+getWidth();
	}
}
class Refill{
	private String inkColor;
	private int length;
   private	Nib tip;
   
   public void setInkColor(String inkColor) {
	   this.inkColor=inkColor;
   }
   public void setLength(int length) {
	   this.length=length;
   }
   public void setTip(Nib tip) {
	   this.tip=tip;
   }
   public String getInkColor() {
	   return inkColor;
   }
   public int getLength() {
	   return length;
   }
   public Nib getTip() {
	   return tip;
   }
   public String toString () {
	  return getInkColor()+" "+getLength()+" "+getTip();
   }
   
}
class Pen{
	private Refill ref;
	private int capLength ;
	private String brand;
	
	public void setRef(Refill ref) {
		this.ref=ref;
	}
	public void setCapLength( int capLength) {
		this.capLength =capLength;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public Refill getRef() {
		return ref;
	}
	public int getCapLength() {
		return capLength;
	}
	public String getBrand() {
		return brand;
	}
	
	public String toString() {
		return (getRef()+" "+getCapLength()+" "+getBrand());
	}
}
public class Structure {

	public static void main(String[] args) {
        Pen p=new Pen();
        p.setCapLength(10);
        p.setBrand("Trimax");
        p.setRef(new Refill());
        p.getRef().setInkColor("Blue");
        p.getRef().setLength(15);
        p.getRef().setTip(new Nib());
        p.getRef().getTip().setMaterialType("Iron");
        p.getRef().getTip().setWidth(5);
        System.out.println(p);
	}

}



/*A Pen contains variables Refill, capLength and brand. Refill has variables
inkColor, length and Nib (tip). Nib has variables materialType and width. Create
a  class structure for above. Write a main method which sets values in all the variables
using setter methods and prints all the variables using getter methods. */

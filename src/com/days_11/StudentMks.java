package com.days_11;

public class StudentMks {
	int rollNo;
	String name;
	int phyMks;
	int chemMks;
	int mathMks;
	
	StudentMks(int rollNo,String name,int phyMks,int chemMks,int mathMks){
		this.rollNo=rollNo;
		this.name=name;
		this.phyMks=phyMks;
		this.chemMks=chemMks;
		this.mathMks=mathMks;
	}
    StudentMks(){
    	this(5,"aaa",89,96,74);
    	System.out.println("Student roll no="+rollNo+"\nStd Name="+name+"\nphy mks="+phyMks+"\nchem mks="+chemMks+"\nMath Mks="+mathMks);
    }
    public  int average() {
      int avg=(phyMks+chemMks+mathMks)/3;
    	return avg;
    }
    
	public static void main(String[] args) {

	StudentMks aaa=new StudentMks();
	aaa.average();
	int avrg=aaa.average();
	System.out.println("Average of three subject="+avrg);

	}

}

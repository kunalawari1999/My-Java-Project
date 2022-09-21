package com.days_14;
class Book {
	String type;
	int price;
}
class Novel extends Book{
	void details() {
		type="Novel";
		price=200;
		String writer="DR.A.P.J.Kalam";
		System.out.println(type+" "+price+" "+writer);
	}
	
}

public class SingleDemo2 {

	public static void main(String[] args) {
		Novel n=new Novel();
		n.details();

	}

}

package com.test24sept;

import java.util.Scanner;

public class NationalGame {
	
 public void game(String country) {
	 switch(country) {
		case "India":
		System.out.println("Hockey");
		break;
		case "China":
		System.out.println("Table Tennis");
		break;
		case "Bangladesh":
		System.out.println("Kabbadi");
		break;
		case "Italy":
		System.out.println("Football");
		break;
		case "UnitedStates":
		System.out.println("BaseBall");
		break;
 }
 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country name");
		String country=sc.next();
		NationalGame g=new NationalGame();
		g.game(country);
		
		

	}

}

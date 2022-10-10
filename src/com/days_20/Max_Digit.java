package com.days_20;
import java.util.Scanner;


class Max_Digit {

	public int find_Max(int num) {

		int max = 0;
		while (num > 0) {

			int r = num % 10;
			if (r > max) {
				max = r;
			}
			num = num / 10;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Max_Digit m = new Max_Digit();
		int a = m.find_Max(num);
		System.out.println("Max digit=" + a);

	}

}


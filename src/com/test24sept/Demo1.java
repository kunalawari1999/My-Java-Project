package com.test24sept;

public class Demo1 {

		int x = 10;

		public void assign(int x) {
			x = x;
			System.out.println(this.x);
		}

		public static void main(String[] args) {

			new Demo1().assign(100);

		}

	}

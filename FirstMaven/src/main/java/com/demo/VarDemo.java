package com.demo;

public class VarDemo {
	int b = 130;

	public void add() {

		// int a = 190;
		final int a = 60;

		 int b = 546;
		System.out.println(a);
		System.out.println(a + b);

	}

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		// int k = (i + j);
		// System.out.println(k);

		System.out.println(i + j);

		VarDemo v = new VarDemo();
		
		v.add();
	}

}

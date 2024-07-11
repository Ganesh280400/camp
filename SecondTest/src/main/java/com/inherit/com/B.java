package com.inherit.com;

public class B extends A {

	void add() {
		System.out.println("B class");
	}

	public static void main(String[] args) {

		B obj = new B();
		obj.add();

	}

}

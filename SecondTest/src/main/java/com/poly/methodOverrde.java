package com.poly;

public class methodOverrde extends methodOverlng {
	public void search(String brand) {
		System.out.println("brand name ......");
	}

	public static void main(String[] args) {

		// this is compile time polymorphism
		methodOverrde obj1 = new methodOverrde();
		obj1.search("Nike");

		// this is run time polymorphism
		methodOverlng obj2 = new methodOverrde();
		obj2.search("puma");
		obj2.search(0);

	}

}

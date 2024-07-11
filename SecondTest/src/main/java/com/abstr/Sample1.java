package com.abstr;

public class Sample1 implements TwoTest {

// A is one interface  B is another interface which extends A ,   
// whatever the class implementing interface B , that should implements 
// methods which present in A , B interfaces 

	public void add() {
		System.out.println(8.5);

	}

	public void mul() {
		System.out.println(9.5);

	}

	public void div() {
		System.out.println("division");

	}

	public void sub() {
		System.out.println("Subtraction");

	}

	public static void main(String[] args) {
		Sample1 obj = new Sample1();
		obj.add();
		obj.mul();
	}

}

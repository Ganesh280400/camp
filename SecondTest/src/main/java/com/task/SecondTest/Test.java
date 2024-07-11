package com.task.SecondTest;

public class Test {
	public int add() {
		int x = 10;
		int y = 20;
		int z = x + y;
		return z;
	}

	public void mul() {
		int z = add();
		System.out.println(z);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.mul();
	}
}

package com.task.SecondTest;

public class TestOne {
	public void add() {
		System.out.println("hello add");
	}

	public static void mul() {
		System.out.println("hello mul");
	}

	public static void main(String[] args) {
		TestOne t = new TestOne();
		t.add();
		mul();

	}
}

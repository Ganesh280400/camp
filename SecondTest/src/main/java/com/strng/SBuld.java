package com.strng;

public class SBuld {

	public static void main(String[] args) {
		StringBuilder sbb= new StringBuilder("Good ");
		sbb.append("Morning");
		System.err.println(sbb);
		System.out.println(sbb.capacity());
		System.out.println(sbb.length());
//		System.out.println(sbb.insert(3,"gan"));
		System.out.println(sbb.replace(4, 10, "chinna"));
		System.out.println(sbb.capacity());
		System.out.println(sbb.charAt(5));
		System.out.println(sbb.length());
		System.out.println(sbb.reverse());
		System.out.println(sbb);

	}

}

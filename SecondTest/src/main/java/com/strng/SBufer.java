package com.strng;

public class SBufer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hey");
		sb.append(" ganesh");
		System.out.println(sb);
		System.out.println(sb.length());
//		System.out.println(sb.insert(3,"rey"));
		System.out.println(sb.replace(4, 10, "bujji"));
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(5));
		System.out.println(sb.length());
		System.out.println(sb.reverse());

	}

}

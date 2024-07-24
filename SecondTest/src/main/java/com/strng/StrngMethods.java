package com.strng;

public class StrngMethods {

	public static void main(String[] args) {
		String s = "Hello World";

		String s1 = new String("hello world");
		String s2 = new String(" HELLO WORLD");
		String s3 = " ";

		System.out.println(s.charAt(4));
		System.out.println(s.concat(" Ganesh"));
		System.out.println(s.concat(s1));
		System.out.println(s.contains("lo"));
		System.out.println(s1.endsWith("ld"));
		System.out.println(s1.endsWith("lD"));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		System.out.println(s1.length());
		System.out.println(s.matches(s2));
		System.out.println(s1.replace("wor", "var"));
		System.out.println(s2.startsWith("HE"));
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(2, 7));
		System.out.println(s1.toCharArray());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.trim());
		System.out.println(s1.split(" "));
	}

}

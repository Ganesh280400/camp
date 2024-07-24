package com.arr;

public class Arr {

	public static void main(String[] args) {
		int[] arr = new int[8];
//		String [] a= new String[9];
		String[] arr1 = { "Ganesh", "Govind", "Bujji", "Chinna" };

		arr[0] = 5;
		arr[1] = 8;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 9;

		System.out.println(arr[1]);

		System.out.println(arr1[3]);
		arr1[3] = "chinni";
		System.out.println(arr1[3]);

	}

}

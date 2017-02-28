package com.hand.chenhao;

/**
 * Hello world!
 *
 */
public class Find_Number {
	public static void main(String[] args) {
		int[] arr = { 8, 6, 5, 9, 4, 3, 7 };
		delete(arr, 5);

	}

	public static void delete(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				System.out.println("取出的数是:" + n);
			}
		}
		System.out.print("剩余的数组为:[");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[arr.length - 1]) {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.print(arr[arr.length - 1] + "]");
	}
}
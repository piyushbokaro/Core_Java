package com.piyush;

import java.util.Scanner;

public class ReverseSquence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String string = scanner.nextLine();
		String str[] = string.split(";");
		System.out.println(reversedByK(str[0].split(","), Integer.parseInt(str[1])));
	}

	private static String reversedByK(String[] nums, int k) {
		StringBuilder result = new StringBuilder();
		for (int i = k - 1; i < nums.length; i += k) {
			for (int j = i; i - j <= k - 1; j--) {
				result.append(',').append(nums[j]);
			}
		}

		for (int i = nums.length - nums.length % k; i < nums.length; i++) {
			result.append(',').append(nums[i]);
		}
		return result.substring(1);
	}

}

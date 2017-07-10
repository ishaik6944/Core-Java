package com.info.assign9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DublicatesInArray {

	public static void main(String[] args) {
		System.out.println("Enter the Length of an array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		Map<Integer, Integer> CountMap = new HashMap<Integer, Integer>();
		for (int nums : num) {
			if (CountMap.containsKey(nums)) {
				CountMap.put(nums, CountMap.get(nums) + 1);
			} else {
				CountMap.put(nums, 1);
			}
		}
		Set<Integer> set = CountMap.keySet();
		for (int no : set) {
			if (CountMap.get(no) > 1) {
				System.out.println("The Element " + no + " is repeated for" + CountMap.get(no) + " times.");
			}

		}
		sc.close();
	}
}

package com.info.assign9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DubCharsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letters String");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		Map<Character, Integer> CountMap = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (CountMap.containsKey(c)) {
				CountMap.put(c, CountMap.get(c) + 1);
			} else {
				CountMap.put(c, 1);
			}
		}
		Set<Character> set = CountMap.keySet();
		for (char chr : set) {
			if (CountMap.get(chr) > 1) {
				System.out.println("The Caharacter " + chr + " is repeated for" + CountMap.get(chr) + " times.");
			}

		}
		sc.close();
	}

}

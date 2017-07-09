package com.info.hospital;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinHashSet {

	public static void main(String[] args) {
		System.out.println("Enter the Min and Max Number of Inputs:");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		Set<Integer> num = new HashSet<Integer>();
		for (int i = k; i < n; i++) {
			num.add(i);
		}

		for (Integer numbr : num) {
			System.out.println(numbr);
		}

		System.out.println("The Minimum Element of HashSet is :" + num.iterator().next());
		sc.close();
	}

}

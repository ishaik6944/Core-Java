package com.info.assign9;

import java.util.Scanner;

public class VowelsAndConsonents {

	public static void main(String[] args) {
		System.out.println("Enter the String You Want to Search for Vowels and Consonents:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String Vowels = "aeiouAEIOU";
		int VowelsCount = 0;
		int ConsonentsCount = 0;
		int i;
		int length = str.length();
		for (i = 0; i < length; i++) {
			char currchar = str.charAt(i);
			if (Vowels.indexOf(currchar) >= 0) {
				VowelsCount++;
			} else if (Character.isLetter(currchar)) {
				ConsonentsCount++;
			}
		}
		System.out.println("Consonents Count in a String is " + ConsonentsCount);
		System.out.println("Vowels Count in a String is " + VowelsCount);
	}

}

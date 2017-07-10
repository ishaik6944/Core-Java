package com.info.assign9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		System.out.println("Enter The String That You Want To Check: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		Map<Character, Integer> checkmap = new HashMap<Character, Integer>();
		for (char chr : ch) {
			if (checkmap.containsKey(chr)) {
				int count = checkmap.get(chr);
				checkmap.put(chr, count + 1);
			} else {
				checkmap.put(chr, 1);
			}
		}
       for(char chr:ch) {
    	   if(checkmap.get(chr)==1) {
    		   System.out.println("First Non-Repeated Character in the String \"" +str+ "\" is "+chr);
    		   break;
    	   }
       }
       sc.close();
	}

}

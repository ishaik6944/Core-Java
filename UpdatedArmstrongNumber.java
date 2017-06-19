package com.info.corejava;

import java.util.Scanner;

public class UpdatedArmstrongNumber {
	public static void main(String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
	       System.out.print("number");
	      input= scanner.nextInt();
       String inputAsString =input +"";
       int numberOfDigits = inputAsString.length();
       int copyOfInput = input;
       int sum = 0;
       while (copyOfInput != 0) {
           int lastDigit = copyOfInput % 10;
           sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
           copyOfInput = copyOfInput / 10;
       }
       if (sum == input) {
         System.out.println("Armstrong Number");
         
       } else {
    	  System.out.println("Not Armstrong Number");
       }
       scanner.close();
	}
}



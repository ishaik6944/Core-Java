package com.info.corejava;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact=1,n;
		System.out.println("Enter the Number to find the Factorial?");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		sc.close();
		System.out.println("The Factorial of Given Number is " + fact);
	}

}

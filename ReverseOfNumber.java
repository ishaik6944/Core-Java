package com.info.corejava;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		int n;int reverse=0;
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0){
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println("The Reverse number is  " + reverse);
		sc.close();
	}


}

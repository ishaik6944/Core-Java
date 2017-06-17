package com.info.corejava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int rvs=0,n,temp;
		System.out.println("Enter the Number to Check?");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		temp = n;
		while(n!=0){
			rvs=rvs*10;
			rvs=rvs+n%10;
			n=n/10;
		}
		if(temp==rvs){
			System.out.println("The Given Number is Palindrome");
		}else{
			System.out.println("The Given Number is Not Palindrome");
		}
		sc.close();
	}

}

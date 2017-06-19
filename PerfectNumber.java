package com.info.corejava;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int temp=0,n;
		System.out.println("Enter the Number to Check?");
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				temp=temp+i;
			}
		}
		if(temp==n){
			System.out.println("The Entered Number is a Perfect Number");
		}else{
			System.out.println("The Entered Number is not a Perfect Number");
		}
		sc.close();	
	}

}

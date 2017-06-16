package com.info.corejava;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a=0,n,i,temp;
		System.out.println("Enter a Number");
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		temp=n;
		while(n>0){
			i=n%10;
			n=n/10;
			a=a+(i*i*i);	
		}
		if(temp==a){
			System.out.println("The Given Number is Armstrong Number");
		}else{
			System.out.println("The Given Number is Not an Armstrong Number");
		}
		sc.close();
	}

}

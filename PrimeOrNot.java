package com.info.corejava;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		 int n,temp;
		 boolean prime=true;
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		for(int i=2;i<n;i++) {
	        temp=n%i;
	        if(temp==0){
	        	prime = false;
	        	break;
	        }
		}
	     if(prime){
	    	 System.out.println("The Number is Prime");
	     }else{
	     System.out.println("The Number is Not prime");
	     }
	     sc.close();
	}

}

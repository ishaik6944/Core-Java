package com.info.corejava6;

import java.util.Scanner;

public class TwoDMultiplication {

	public static void main(String[] args) {
		int k;
	  System.out.println("Enter The Input:");
	  Scanner sc =new Scanner(System.in);
	  int n =sc.nextInt();
	  for(int i=1;i<=10;i++){
		  k=n*i;
		  System.out.println(n+"*"+i+"="+k);
	  }
	  sc.close();
	}
}

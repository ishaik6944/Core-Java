package com.info.corejava6;

import java.util.Scanner;

public class ThreeDMultiplication {

	public static void main(String[] args) {
		int k;
	  System.out.println("Enter User Input:");
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  for(int i=1;i<=10;i++){
		  for(int j=1;j<=10;j++){
			 k=n*i*j;
			 System.out.println(n+"*"+i+"*"+j+"="+k);
		  }
	  }
sc.close();	  

	}

}

package com.info.corejava;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
    int a=0,b=1,c,count;
    System.out.println("Enter the Value of count?");
    Scanner sc= new Scanner(System.in);
    count=sc.nextInt();
    System.out.print(a+" "+b);
    for(int i=2;i<count;++i){
    	c=a+b;
    	System.out.print(" "+c+" ");
    	a=b;
    	b=c;
    }
    sc.close();
	}

}

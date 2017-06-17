package com.info.corejava;

import java.util.Scanner;

public class MinimumNumber {

	public static void main(String[] args) {
	 int a;int b;int c;int d;
System.out.println("Please Enter the 4 Numbers");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
d = sc.nextInt();
if(a<=b && a<=c && a<=d){
	System.out.println("a is Smallest Number");	
}else if(b<=a && b<=c && b<=d){
	System.out.println("b is Smallest Number");
}else if(c<=a && c<=b && c<=d){
	System.out.println(" c is Smallest Number");
}else{
	System.out.println("d is Smallest Number");
}
sc.close();
}
	}



package com.info.corejava3;

import java.util.Scanner;

public class Students1 {
	int num;
	String name;
	double fee;
	char sec;
	Students1(){
		
	}
	
	public Students1(int num, String name, double fee, char sec) {
		this.num = num;
		this.name = name;
		this.fee = fee;
		this.sec = sec;
	}

	public static void main(String[] args) {
		System.out.println("Enter The Number of Students:");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		Students1 [] stud=new Students1 [n];
		for(int i=0;i<stud.length;i++){
		System.out.println("Enter Student-"+(i+1)+"Number:");
		int  num=sc.nextInt();
		System.out.println("Enter Student-"+(i+1)+"Name:");
		String name=sc.next();
		System.out.println("Enter Student-"+(i+1)+"Fee:");
		double fee=sc.nextDouble();
		System.out.println("Enter Student-"+(i+1)+"Sec:");
		char sec=sc.next().charAt(0);
	   stud[i]=new Students1(num, name, fee, sec);
	  	}
		for(int i=0;i<n;i++){
			Students1 s=stud[i];
			System.out.println(" Id "+" Name "+" Fee "+" Sec ");
		 System.out.println(s.toString());
		}
		sc.close();
	}
	@Override
	public String toString() {
		return  num + " - " + name + " - " + fee + " - " + sec + "";
	}
}

	



package com.info.corejava3;

import java.util.Scanner;

public class Students3 {
	public static void main(String[] args) {
		System.out.println("Enter the number of Students:");
		Scanner sc = new Scanner(System.in);
		int i;
		int n = sc.nextInt();
		Students22[] stud = new Students22[n];
		for(i=0;i<stud.length;i++){
			System.out.println("Enter Student-"+(i+1)+" Id:");
			int id=sc.nextInt();
			System.out.println("Enter Student-"+(i+1)+" name:");
			String name=sc.next();
			System.out.println("Enter Student-"+(i+1)+" fee");
			double fee=sc.nextDouble();
			System.out.println("Enter Student-"+(i+1)+" Section");
			String sec=sc.next();
			stud[i]=new Students22(id, name, fee, sec);
		}		
		System.out.println("Id    Name    Fee    Section:");
		for(int i1=0;i1<stud.length;i1++){
		 Students22 s=stud[i1];
		 System.out.println(s.toString());
			
		}
		sc.close();

	}
	

}

class Students22{
	private int id;
	private String name;
	private double fee;
	private String sec;
	
	Students22(){
		
	}

	public Students22(int id, String name, double fee, String sec) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.sec = sec;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	@Override
	public String toString() {
		return  id + " - " + name + " - " + fee + " - " + sec + "";
	}

}	 


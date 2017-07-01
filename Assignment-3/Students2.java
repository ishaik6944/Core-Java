package com.info.corejava3;
import java.util.Scanner;
public class Students2 {
	public static void main(String[] args) {	
		System.out.println("Enter the Number of Students:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int id[]=new int[n];
		String name[]=new String[n];
		double fee[]=new double[n];
		char sec[]=new char[n];		
		insert(n,id,name,fee,sec);
		System.out.println("Enter the Section That you want to Display:");
		char section=sc.next().charAt(0);
		System.out.println(" Id "+"-"+" Name "+"-"+" Fee "+"-"+" Sec ");
		display(n,section, id, name, fee, sec);
		sc.close();
	}
	

	static void display(int n,char section,int id[],String name[],double fee[],char sec[]) {
		for(int i=0;i<n;i++) {
    	   if(sec[i]==section) {
    		   System.out.println(id[i]+" - "+name[i]+" - "+fee[i]+" - "+sec[i]);
    		   
    	   }
		}
    	   }
static int i = 0;

static void insert(int n,int id[],String name[],double fee[],char sec[]) {
	Scanner sc = new Scanner(System.in);

	if (i < n) {
		System.out.println("Enter Student-" + (i + 1) + " Id:");
		 id[i] =sc.nextInt() ;
		System.out.println("Enter Student-" + (i + 1) + " name:");
		name[i] = sc.next();
		System.out.println("Enter Student-" + (i + 1) + " fee");
		fee[i] = sc.nextDouble();
		System.out.println("Enter Student-" + (i + 1) + " Section");
	    sec[i] = sc.next().charAt(0);
		i++;
		insert(n,id,name,fee,sec);
	}
	sc.close();
}

}

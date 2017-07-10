package com.info.assign9;

import java.util.Scanner;

public class MostElement {

	public static void main(String[] args) {
		System.out.println("Enter The Number of Integers In an Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter The array elements:");
		int[] ar=new int[n];
		for(int i1=0;i1<n;i1++) {
			ar[i1]=sc.nextInt();
		}
		int count=1,inc,temp=0;
		int mostaprelmnt=ar[0];
		for(int i=0;i<(ar.length-1);i++) {
			temp=ar[i];
			inc=0;
			for(int j=1;j<ar.length;j++) {
				if(temp==ar[j]) {
					inc++;
				}
				if(inc>count) {
					mostaprelmnt=temp;
					count=inc;
				}
			}	
		}
		System.out.println(mostaprelmnt+" is the Most Appeared Number and Appeared "+count+ " times.");
		//sc.close();
	}

}

package com.info.corejava6;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		System.out.println("Enter the Length of an array of Numbers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] Arr=new int[n];
		System.out.println("Enter the Numbers:");
		for(int i=0;i<n;i++) {
			Arr[i]=sc.nextInt();
		}
		Arrays.sort(Arr);
		System.out.println(Arr[n-2]);
		sc.close();
	}

}

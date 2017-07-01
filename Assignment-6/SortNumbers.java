package com.info.corejava6;
import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
      System.out.println("Enter the length of Numbers:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] Arr=new int[n];
      for(int i=0;i<n;i++) {
    	  Arr[i]=sc.nextInt();
      }
     Arrays.sort(Arr);
      for(int i=0;i<n;i++) {
      System.out.print(Arr[i]+" ");
      }
      sc.close();
	}
}

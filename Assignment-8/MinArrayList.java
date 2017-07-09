package com.info.hospital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class MinArrayList {

	public static void main(String[] args) {
	  System.out.println("Enter the Range of min and max numbers:");
	  int j,n;
	  Scanner sc=new Scanner(System.in);
	  j=sc.nextInt();
	  n=sc.nextInt(); 
	  List<Integer>arl=new ArrayList<>();
	  for(int i=j;i<n;i++) {
			arl.add(i);	
	  } 
	Collections.sort(arl,new Sort());
	for(Integer num:arl) {
		System.out.println(num);
	}
	System.out.println("The Minimum Element of ArrayList is: "+arl.get(0));
	sc.close();

	}

}
class Sort implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1.intValue()-o2.intValue();
	}
	
}
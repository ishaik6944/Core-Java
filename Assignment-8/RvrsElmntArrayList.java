package com.info.hospital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RvrsElmntArrayList {

	public static void main(String[] args) {
	 List<String> al=new ArrayList<String>();
	 al.add("Apple");
	 al.add("Ball");
	 al.add("Cat");
	 al.add("Dog");
	 al.add("Hen");
	 al.add("Horse");
	 System.out.println("The Array List Before Elements Reverse :"+al);
	 Collections.reverse(al);
	 System.out.println("The Array List After Elements Reverse :"+al);
	}

}

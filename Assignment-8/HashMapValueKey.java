package com.info.hospital;

import java.util.HashMap;

public class HashMapValueKey {

	public static void main(String[] args) {
		HashMap hmap=new HashMap();
		hmap.put(1,"Apple");
		hmap.put(2,"Ball");
		hmap.put(3,"Cat");
		hmap.put(5,"Dog");
		hmap.put(4,"Egg");
		hmap.put(7,"Hen");
		hmap.put(6,"Zoo");
		boolean ValueExist=hmap.containsValue("Zoo");
		System.out.println("The Value Exists In Hmap is:"+ValueExist);
		boolean KeyExist=hmap.containsKey(7);
		System.out.println("The Key Exist in Hmap is :"+KeyExist);
	}

}

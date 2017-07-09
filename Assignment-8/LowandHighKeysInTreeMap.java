package com.info.hospital;

import java.util.TreeMap;

public class LowandHighKeysInTreeMap {

	public static void main(String[] args) {
		TreeMap treemap = new TreeMap();
		treemap.put(1, "One");
		treemap.put(1, "One");
		treemap.put(3, "Three");
		treemap.put(2, "Two");
		treemap.put(5, "Five");
		treemap.put(4, "Four");
		treemap.put(10, "Ten");
		System.out.println("The Lowest Key Of Tree Map is :" + treemap.firstKey());
		System.out.println("The Highest Key Of Tree Map is :" + treemap.lastKey());

	}

}

package com.info.corejava2;

public class DiffReturntype {
	interface I1{
		int m1();	
	}
	interface I2{
		String m1();
	}
class C implements I1,I2{

	public int m1() {
		return 101;
	}
	public String m1(){
		return "Shaik";
	}
	
	
}
}

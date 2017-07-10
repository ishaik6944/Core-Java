package com.info.corejava2;

public class Demo {

}

interface interf{
	void m1();
	
}
interface intre{
	void m2();
}

abstract class Absclas{
	abstract void m3();
	void m4(){
		System.out.println("This is method a");
	}
	
}

class Child extends Absclas implements interf,intre{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		
	}
	
}
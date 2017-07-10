package com.info.corejava2;

public class ObjectForAClass {
	
	public static void main(String[] args) {
       C2 c = new C2();
       c.m1();
       c.m2();
       c.m3();
	}

}
interface I1{
	void m1();
}
interface I2{
	void m2();
}
abstract class C1 implements I1,I2{
public void m1(){
	System.out.println("Interface I1 Method");
}
public void m2(){
	System.out.println("Interface I2 Method");
}
abstract void  m3();

}
class C2 extends C1{
public void m3(){
	System.out.println("This is Abstract method from Class C1");
}
}
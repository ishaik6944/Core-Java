package com.info.corejava2;

public class parentChild {

	public static void main(String[] args) {
		Parent p = new Child1();
		p.method1();
		p.method2();
		System.out.println(p.x);
		System.out.println(p.a);
		Child1 c = new Child1();
		System.out.println(c.a);
		System.out.println(c.x);
		System.out.println(c.gpa);
		c.method1();
		c.method2();
		c.method3();

	}

}

class Parent {
	int x = 10;
	String a = "Irfan";

	void method1() {
		System.out.println("This is Method-1");

	}

	void method2() {
		System.out.println("This Is Method-2");

	}
}

class Child1 extends Parent {
	int x = 15;
	String a = "Irfan Shaik";
	double gpa = 3.6;

	void method1() {
		System.out.println("This is Overridden Method-1");
	}

	void method3() {
		System.out.println("This is child Method");
	}

}

package com.info.corejava2;

public class AccessSpecifiers {
	public int a=10;
	String b="Irfan";
	private double c=10.7;
	protected char d='s';
	public void m1() {
		System.out.println("M1");
	}
   void m2() {
	   System.out.println("M2"); 
   }
   private void m3() {
	   System.out.println("M3"); 
   }
   protected void m4() {
	   System.out.println("M4"); 
   }
	public static void main(String[] args) {
		AccessSpecifiers as=new AccessSpecifiers();
		System.out.println(as.a);
		System.out.println(as.b);
		System.out.println(as.c);  
	     System.out.println(as.d);
	     as.m1();
	     as.m2();
	     as.m3();
	     as.m4();
	     King k=new King();
	     System.out.println(k.a);
	     k.m1();
	     Queen q=new Queen();
	     
		
	}

}
class King{
	public int a=10;
	void m1() {
		System.out.println("K-Method");
	}
	
}
abstract class Queen{
	void m2() {
		
	}
}

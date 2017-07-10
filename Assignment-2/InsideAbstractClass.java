package com.info.corejava2;

public class InsideAbstractClass extends Abs {
	
public static void main(String[] args) {
		
	InsideAbstractClass iac=new InsideAbstractClass();	
   
	

	}

}
abstract class Abs{
	Abs(){
		
	}
	static{
		System.out.println("It is a Static Block");
	}
	{
		System.out.println("It is an Instance Block");
	}
	
}

	


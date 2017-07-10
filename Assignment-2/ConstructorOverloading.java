package com.info.corejava2;

public class ConstructorOverloading {
	public class A{
		 A(){
			
		}
		 A(int p,String q){
			 }
		 //From the above it is very Clear that we can Overload a Constructor.
	}
	public class B extends  A{
		    B(){
		    	
		    }
		   void  A(){//When I try to override Constructor of Class A the extended class B is taking it as a Mothod not as a constructor.
		    	
		    }//Hence Method Overriding is not Possible.
		
	}

}

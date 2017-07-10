package com.info.corejava2;

public class TwoInterfaces {
	interface Walk{
		void speed();
	}
interface Run{
	void speed();
}

static class Boy implements Walk,Run{
	
public void speed(){
	System.out.println("Boy Walk and Run");
}

public static void main(String[] args) {
	Boy b= new Boy();
	b.speed();
	Walk w=new Boy();
	w.speed();
	Run r=new Boy();
	r.speed();	
}
}
}

	


	




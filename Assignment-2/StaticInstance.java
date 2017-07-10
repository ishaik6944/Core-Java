package com.info.corejava2;

public class StaticInstance {
	interface I{
		static{
			System.out.println("This is a Static Block");
		}
		{
			
		}
	}

}
// Hence Interface Cannot take Static and Instance Blocks in It.If we do so it will show an error.
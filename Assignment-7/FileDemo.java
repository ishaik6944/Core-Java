package com.info.collections;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {	
	 String text="Hi My Name Is Irfan Shaik Welcome To My World.";
	 String filename="Irfan.txt";
	 String path=System.getProperty("user.dir");
	 System.out.println(path);
	 String abspath=path+File.separator+filename;
	 BufferedWriter bw=null;
	 try {
		FileWriter f=new FileWriter(abspath);
		bw =new BufferedWriter(f);
		 bw.write(text);
		 bw.flush();
		 
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String[] s=filename.split(" ");
	for(int i=0;i<=s.length-1;i++) {
		String str=s[i];
		System.out.println(str.length());
	}
	
	String str=text.replace("World","TextPage");
	System.out.println(str);
	try {
		bw.write(str);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	}

}

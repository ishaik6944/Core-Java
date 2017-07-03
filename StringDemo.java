package com.info.corejava3;

public class StringDemo {

	public static void main(String[] args) {
		int k=0;
	 String str="This is a java class";
	  String[] s =str.split(" ");
	  System.out.println(s.length);
	  System.out.println(str.length());
	  System.out.println(str.replace("java","SQL"));
	  StringBuffer buffer=new StringBuffer(str);
	 String[] words=str.split("\\s+");
	 for(int i=0;i<words.length;i++) {
		 String word=words[i];
		String reverseWord = new StringBuilder(word).reverse().toString();
		 System.out.println(reverseWord);
	 }
	  String rvrsstr=buffer.reverse().toString();
	  System.out.println(rvrsstr);	 
	  System.out.println(str.charAt(10));
	  System.out.println(str.indexOf('j'));
	  System.out.println(str.toUpperCase());
	  System.out.println(str.indexOf("This"));
	  System.out.println(str.indexOf("is"));
	  System.out.println(str.indexOf('a'));
	  System.out.println(str.indexOf("java"));
	  System.out.println(str.indexOf("class")); 
	  str=str.replaceAll(" ","");
	  for(int i=0;i<str.length();i++) {
		  int count=0;
		 for(int j=0;j<str.length();j++) {
			if (str.charAt(i)==str.charAt(j)) {
				count++;
				
			} 
			System.out.println("Number of Times Each Letter Repeated is:"+count);
		 }
		 if(count==1) {
			 System.out.println(str.charAt(i)+" Not Repeated.");
		
		 }
		 
		  
	  }
	  
	
	 

	}

}

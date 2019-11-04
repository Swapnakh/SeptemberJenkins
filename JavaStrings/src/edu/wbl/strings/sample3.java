package edu.wbl.strings;

public class sample3 {

	public static void main(String[] args) {
		
		String s="swapna";
		
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.indexOf("p"));
		 //          0        1   2   3
		String str="learning java is fun";
		
		// String a[]= new String[10];
		//int a[];
		//int a[]= new int [10];  can u access 11
		 
		
		 String[]  words     =     str.split(" ");
		 
		 
		 for(String w: words)
		 {
			 System.out.println(w);
		 }
		
				
		 for(int i=0;i<words.length;i++)
			 
		 {
			 System.out.println(words[i].length());
			 
		 }
		
		
		
	}

}

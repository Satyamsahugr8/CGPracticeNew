package com.pooja;

public class WrapperExample {
	
	public static void main(String[] args) {
		
		int a = 9;
		boolean v = true;
		char s = 'a';
		String str = "Satyam";
//		string str = "sahu";

		System.out.println("s: "+s);
		System.out.println("s: "+s);
		

		//auto boxing - internally
		Integer ss = a - s;
	
		byte vf = (byte) s;
		
		Byte b = (byte) a;
		
		int vvv = b;
		
		//auto boxing - externally
		Integer nn = Integer.valueOf(a);
		
		
//		unboxing - 
		int dd = ss; //internally
		
		//expicit
		int dsdds = ss.intValue();
		
		
		
		
	}

}

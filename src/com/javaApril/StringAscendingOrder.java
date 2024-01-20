package com.javaApril;

public class StringAscendingOrder {

	public static void stringAscending(String str) {

		char temp;
		char [] ch = new char[str.length()];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}
		
		System.out.println(ch);

		for (int i = 0; i < str.length(); i++) {
			
			for (int j = 0; j < str.length(); j++) {

				if (ch[i] < ch[j]) {

					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					
				}
			}
			
		}
		String newStr = new String(ch);
		System.out.println("NewString:"+newStr);
	}

	public static void main(String[] args) {
		
		String str = "hello";
		stringAscending(str);
		
		

	}

}

package com.javaApril;

import java.util.ArrayList;

public class StringRemoveSpace {

	public static String removeSpace(String str) {
		
		int length = str.length();
		char [] ch;
		String strr;
		
		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}

		for (int i = 0; i < length; i++) {
			if (' ' == list.get(i)) {
				list.remove(i);
				length--;
			}
		}

		ch = new char[list.size()];		
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = list.get(i);
		}
		
		strr = new String(ch);
		
		return strr;
	}

	public static void main(String[] args) {

		String str = "hey satyam sahu";
		System.out.println(str);
		System.out.println(removeSpace(str));
		
		String sss = "sss vfdvv  fdfd ffd";
		System.out.println(sss);
		System.out.println(removeSpace(sss));

	}

}

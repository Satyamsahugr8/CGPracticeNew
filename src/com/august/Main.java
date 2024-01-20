package com.august;

public class Main {

	public static void main(String[] args) {

		String str = "pooja";
		boolean v = false;

		for (int i = 0; i < str.length() - 1; i++) {

			for (int j = i + 1; j < str.length() - 1; j++) {
				
//				System.out.println(str.charAt(i));
//				System.out.println(str.charAt(j));

				if (str.charAt(i) == str.charAt(j)) {
					System.out.println("str.charAt(i): " + str.charAt(i));
					v = true;
				} 
			}
		}
		
		if(v == false) {
			System.out.println("no repeated character");
		}
	}
}

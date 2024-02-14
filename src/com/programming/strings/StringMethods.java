package com.programming.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Java String Pool refers to Collection of Strings which are stored in heap memory";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('a', '$'));
		
		if(str.contains("Collection")) {
			System.out.println("The given word is present");
			
		}else {
			System.out.println("The given word is not present");
		}
		
		String str2 = "Java String Pool refers to Collection of Strings which are stored in heap memory";
		if(str.equals(str2)) {
			System.out.println("the two string are equal");
		}else {
			System.out.println("the string are not equal");
		}

	}

}

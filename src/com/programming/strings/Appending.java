package com.programming.strings;

public class Appending {

	public static void main(String[] args) {
		String str = "String Buffer";
		String str1 = "is a peer class of string";
		String str2 = "that provides much of";
		String str3 = "the functionality of strings";
		StringBuffer sb =  new StringBuffer(str);
		sb.append(" is a peer class of string");
		System.out.println(sb);
		
		StringBuffer sb1 =  new StringBuffer("it is used to at the specified index position");
		sb1.insert(13, " insert text");
		System.out.println(sb1);
		
		String s = "This method returns the reversed object on which it was called";
		StringBuffer sb2 = new StringBuffer(s);
		sb2.reverse();
		System.out.println(sb2);
		
		
//		String[] arr = s.split(" ");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
	
		

	}

}

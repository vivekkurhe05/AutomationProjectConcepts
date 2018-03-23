package com.javaprograms;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Welcome to Java";
		String str2="Java Programming";
		String str3="strings are immutable";
		String str4="strings are immutable";
		String str5="integers are not immutable";
		System.out.println(str1.charAt(5));
		System.out.println(str1.concat(str2));
		System.out.println(str1.endsWith("java"));
		System.out.println(str1.startsWith("Wel"));
		System.out.println(str1.intern());
		
		System.out.println(str3.compareTo(str4));
		System.out.println(str4.compareTo(str5));
		

	}

}


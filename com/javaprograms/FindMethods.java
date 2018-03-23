package com.javaprograms;

import java.lang.reflect.Method;

public class FindMethods {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		Class c=Class.forName("abcd.Test");
		Method[] met=c.getDeclaredMethods();
		
		for(Method m:met){
			System.out.println(m.getName());
		}
		

	}

}

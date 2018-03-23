package com.javaprograms;

import com.javaprograms.MyException;

public class UserDefinedException {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		
		int i=8,j=2;
		int k=i/j;
		
		try{
			if(k<5){
				throw new ArithmeticException("Value is less than 5");
			}
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
		

	}

}

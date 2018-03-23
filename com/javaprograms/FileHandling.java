package com.javaprograms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:/Users/sai/Desktop/myfile.properties");
		FileOutputStream fos=new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fos);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a data: ");
		String data=br.readLine();
		dos.writeUTF(data);
		System.out.println("data stored successfully");
		
		FileInputStream fis=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.readUTF());
		
		dos.close();
		dis.close();
		
		

	}

}

package com.codeo.filehandling;

import java.io.File;
import java.io.IOException;

public class filecreation {

	
	public static void main(String[] args) {
		File file=new File("C:\\Games//amit.txt");
		try {
		boolean result=file.createNewFile();
		System.out.println(result);
		System.out.println(file.length());
		} catch (IOException e) {
			
			System.out.println("file not found");
			e.printStackTrace();
		
		}
		File file1=new File("C:\\\\DISK E\\\\java class\\\\CORE JAVA\\\\DAY 27//demo");
		file1.mkdir();
		File file2=new File(file1,"file.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

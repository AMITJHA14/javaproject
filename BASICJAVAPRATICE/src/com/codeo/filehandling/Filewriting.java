package com.codeo.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriting {

	public static void main(String[] args) throws IOException {
		System.out.println("WRITE SOMETHING");
		Scanner sc=new Scanner(System.in);
		String content=sc.nextLine();
		FileWriter filewriter=new FileWriter("C:\\\\Games//amit.txt");
		filewriter.write(content);
		filewriter.close();
	}

}

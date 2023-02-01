package com.practice;

import java.util.Scanner;

public class StringOutput2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the First Value" );
			
			String Str=sc.next();
			System.out.println("Enter the Second Value" );	
         
			String Str1=sc.next();
			String Str3=Str.concat(Str1);
			System.out.println("Your Final Result"+Str3);
			
	}

}

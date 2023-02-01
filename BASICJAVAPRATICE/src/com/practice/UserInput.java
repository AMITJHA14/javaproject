package com.practice;

import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First Number");
		int a=sc.nextInt();
		System.out.println("Enter your Second Number");
		int b=sc.nextInt();
		System.out.println("Enter your character");
		char ch=sc.next().charAt(0);
		int c=a+b;
		System.out.println("Additionofnumbers"+c);
	}

}

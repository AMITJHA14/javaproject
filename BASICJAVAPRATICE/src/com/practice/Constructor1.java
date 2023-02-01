package com.practice;

public class Constructor1 {
	int a ;
	int b ;

	public Constructor1() {
		System.out.println("default constructor");
	}
	
	public Constructor1(int a, int b) {
		System.out.println(a+b);
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		Constructor1 c=new Constructor1();
Constructor1 q=new Constructor1(45,5);
	}

}

package com.practice.operators;

public class RelationalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=10;
		int d=10;
		
		if(a==b==c==d) {
			System.out.println("Enter different number");
		}
		else if(a>b){
			System.out.println("a is greater");
			
		}
		else if (b>c) {
			System.out.println("b is greater");
		}
		else if (c>d){
			System.out.println("c is greater");
		}
		else {
			System.out.println("d is greater");
		}
	}

}

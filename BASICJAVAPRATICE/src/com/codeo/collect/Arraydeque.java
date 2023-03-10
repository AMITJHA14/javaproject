package com.codeo.collect;

import java.util.ArrayDeque;

public class Arraydeque {

	public static void main(String[] args) {
		ArrayDeque<String> ard= new ArrayDeque();
		ard.add("amit");
		ard.add("vishal");
		ard.add("shubham");
		ard.add("shubo");
		ard.add("vish");
		for(String str:ard) {
			System.out.println(str);
	
}
	System.out.println("==================================");
		
	
//		ard.pollFirst();
//		System.out.println(ard);
	
		System.out.println("====================================");
	
		ard.pollLast();
		System.out.println(ard);
}
	
}
 
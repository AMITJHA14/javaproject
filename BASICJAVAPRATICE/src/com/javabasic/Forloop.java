package com.javabasic;

public class Forloop {

	public static void main(String[] args) {
		
	
//		for(int i=1; i<=10;i++)
//		System.out.println("amit");
		
		int arr[]= {1,2,3,4,5};
		int n = arr.length;
		for (int i =0; i<n/2; i++) {
			int temp = arr[i];
			arr[i]= arr[n-1-i];
			arr[n-1-i]=temp;
		
		}

	
			
		}
	}



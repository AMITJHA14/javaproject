package com.practice;

public class cars{

	int wheels;
	String name;
	double mileage;
	
	public cars() {
		System.out.println("Default Constructor");
	}
	
	public cars(int wheels,	String name,double mileage)
	{
		this.wheels=wheels;
		this.name=name;
		this.mileage=mileage;
		
	}
	
	public static void main(String[] args) {
		cars hurracane=new cars(4,"hurracane",7.8);
		System.out.println("lambo hurracane: " +hurracane.wheels+" "+hurracane.name+" "+hurracane.mileage);

	}

}

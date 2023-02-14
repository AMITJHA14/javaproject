package com.codeo.inheritance;

public class cuboid extends retangular {
	double height;
    
	
	
	public cuboid(double length, double breadth, double height) {
		super(length, breadth);
		this.height = height;
	}



	public void calculatecuboid() {
	System.out.println("calculate Area of cuboid :" +(length*breadth*height));
	}
}

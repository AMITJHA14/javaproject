package com.codeo.inheritance;

public class retangular extends calculateArea{
	double length;
	double breadth;

	
	
	
	public retangular(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}




	public void calculateareaofrentangular()
	{
		System.out.println("Area of retangle :  " + (length*breadth));
    }
}
package com.date.time;

import java.util.GregorianCalendar;

public class Atmslip {

	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println("your Transaction is completed successfully");
		System.out.println(gc.get(gc.DATE)+"/"+gc.get(gc.MONTH)+"/"+gc.get(gc.YEAR));
		System.out.println((gc.get(gc.HOUR_OF_DAY))+""+ gc.get(gc.())+":"+gc.get(gc.SECOND));

	}

}

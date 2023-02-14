package com.codeo.abstracts1;
import com.codeo.abstracts1.laptopshop;

public class ASUS extends laptopshop {
	
	
	@Override
	public void laptoprepairing() {
		System.out.println("windows repairing" );
		
		
	}
	
	
	@Override
	public void laptopwarranty() {
		System.out.println("laptop warranty for 6 months");
	
		
	}
	
    @Override
    public void repairingcharges(double repairingcharges ) {
	 double finalrepairingcharges;
	 finalrepairingcharges =repairingcharges+(repairingcharges*7.5/100);
	 System.out.println("final bill for repairing charges is"+ finalrepairingcharges);
    }

	  void refferal() {
			System.out.println("you will get 20% discount");
	
    
    }
}


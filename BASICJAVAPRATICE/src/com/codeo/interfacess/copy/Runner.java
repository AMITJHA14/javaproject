package com.codeo.interfacess.copy;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter ticket booking app");
        String Services=sc.next();
        if(Services.equals("Mmt")){
        	Airindia Mmt=new MakeMyTRIP();
        	Mmt.TicketBoooking();
        	Mmt.TicketBoookingdiscount();
        	Mmt.SMS();
        	Mmt.Ticketcancellation();
        	Mmt.refund();
        }
        else if(Services.equals("Goibibo")) {
        	Airindia go=new Goibibo();
        	go.TicketBoooking();
        	go.TicketBoookingdiscount();
        	go.SMS();
        	go.Ticketcancellation();
        	go.refund();
        }
        else
       System.out.println("invalid Services");
	}

	
	
}

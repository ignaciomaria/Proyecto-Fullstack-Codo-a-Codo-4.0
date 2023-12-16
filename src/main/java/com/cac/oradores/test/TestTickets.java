package com.cac.oradores.test;

import com.cac.oradores.services.ITicketService;
import com.cac.oradores.services.impl.TicketService;

public class TestTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ITicketService ticketService = new TicketService();
		
		System.out.println(ticketService.listarTickets());
	}
}

package com.cac.oradores.dao;

import java.util.List;

import com.cac.oradores.entities.Ticket;

public interface ITicketDao {
	
	public void addTicket(Ticket ticket);
	public List<Ticket> getTickets();
	public void deleteTickets(String correo);
}

package com.cac.oradores.services;

import java.util.List;

import com.cac.oradores.entities.Ticket;

public interface ITicketService {
	
	public void comprarTicket(String nombre, String apellido, String correo, int cantidad, String categoria);
	public List<Ticket> listarTickets();
	public void eliminarTicket(String correo);
	public int calcularValorTicket(int cantidad, String categoria);
}

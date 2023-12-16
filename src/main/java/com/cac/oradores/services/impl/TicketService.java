package com.cac.oradores.services.impl;

import java.util.List;

import com.cac.oradores.dao.ITicketDao;
import com.cac.oradores.dao.impl.TicketDao;
import com.cac.oradores.entities.Ticket;
import com.cac.oradores.services.ITicketService;

public class TicketService implements ITicketService{

	ITicketDao ticketDao = new TicketDao();
	
	@Override
	public void comprarTicket(String nombre, String apellido, String correo, int cantidad, String categoria) {
		// TODO Auto-generated method stub
		int valor = this.calcularValorTicket(cantidad, categoria);
		Ticket nuevoTicket = new Ticket(nombre, apellido, correo, cantidad, categoria, valor);
		ticketDao.addTicket(nuevoTicket);
	}

	@Override
	public List<Ticket> listarTickets() {
		// TODO Auto-generated method stub
		return ticketDao.getTickets();
	}

	@Override
	public void eliminarTicket(String correo) {
		// TODO Auto-generated method stub
		ticketDao.deleteTickets(correo);
	}

	@Override
	public int calcularValorTicket(int cantidad, String categoria) {
		// TODO Auto-generated method stub
		int valorTotal = 0;
		int valorTicket = 200;
		if(categoria.equals("Estudiante")) {
			valorTotal = (int) (valorTicket*cantidad*0.20);
		}else if(categoria.equals("Trainee")) {
			valorTotal = (int) (valorTicket*cantidad*0.50);
		}else if(categoria.equals("Junior")) {
			valorTotal = (int) (valorTicket*cantidad*0.85);
		}
		return valorTotal;
	}
}

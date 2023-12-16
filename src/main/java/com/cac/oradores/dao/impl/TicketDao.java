package com.cac.oradores.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cac.oradores.config.ConexionDB;
import com.cac.oradores.dao.ITicketDao;
import com.cac.oradores.entities.Ticket;

public class TicketDao implements ITicketDao{
	
	public TicketDao() {}
	
	@Override
	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ConexionDB conexion = new ConexionDB();
		try (Statement estado = conexion.getConect().createStatement()){
			estado.executeUpdate("INSERT INTO TICKET(NOMBRE, APELLIDO, CORREO, CANTIDAD, CATEGORIA, VALOR)"
								+ "VALUES('"+ticket.getNombre()+"','"+ticket.getApellido()
								+"','"+ticket.getCorreo()+"',"+ticket.getCantidad()+",'"
								+ticket.getCategoria()+"',"+ticket.getValor()+");");
		} catch (SQLException sqlE) {
			// TODO: handle exception
			sqlE.printStackTrace();
		}finally {
			conexion.cerrarConexion();
		}
	}

	@Override
	public List<Ticket> getTickets() {
		// TODO Auto-generated method stub
		List<Ticket> lista = new ArrayList<Ticket>();
		ConexionDB conexion = new ConexionDB();
		try (Statement estado = conexion.getConect().createStatement()){
			ResultSet rs = estado.executeQuery("SELECT* FROM TICKET;");
			Ticket ticketAux;
			while(rs.next()) {
				ticketAux = new Ticket(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7));
				lista.add(ticketAux);
			}
		} catch (SQLException sqlE) {
			// TODO: handle exception
			sqlE.printStackTrace();
		}finally {
			conexion.cerrarConexion();
		}
		return lista;
	}

	@Override
	public void deleteTickets(String correo) {
		// TODO Auto-generated method stub
		ConexionDB conexion = new ConexionDB();
		try (Statement estado = conexion.getConect().createStatement()){
			estado.executeUpdate("DELETE FROM TICKET WHERE CORREO ="+correo);
		}catch (SQLException sqlE) {
			// TODO: handle exception
			sqlE.printStackTrace();
		}finally {
			conexion.cerrarConexion();
		}
	}
}

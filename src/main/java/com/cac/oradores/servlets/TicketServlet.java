package com.cac.oradores.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.cac.oradores.services.ITicketService;
import com.cac.oradores.services.impl.TicketService;

/**
 * Servlet implementation class TicketServlet
 */
@WebServlet("/comprar-ticket")
public class TicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ITicketService ticketService = new TicketService();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Servlet funcionando");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Extraigo los datos del formulario
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		String cantidad = request.getParameter("cantidad");
		String categoria = request.getParameter("categoria");
		
		//Envio los datos a la capa service
		ticketService.comprarTicket(nombre, apellido, correo, Integer.parseInt(cantidad) , categoria);
		
		//Redirijo a la pagina principal
		response.sendRedirect("ticket.html");
	}

}

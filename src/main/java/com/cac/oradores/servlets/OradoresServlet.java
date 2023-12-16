package com.cac.oradores.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.cac.oradores.services.IOradorService;
import com.cac.oradores.services.impl.OradorService;

/**
 * Servlet implementation class OradoresServlet
 */
@WebServlet("/oradores")
public class OradoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	IOradorService oradores = new OradorService();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OradoresServlet() {
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
		String nombre = request.getParameter("nom");
		String apellido = request.getParameter("apell");
		String descripcion = request.getParameter("area");
		
		//Envio los datos a la capa service
		oradores.agregarOrador(nombre, apellido, descripcion);
		
		//Redirijo a la pagina principal
		response.sendRedirect("index.html");
	}

}

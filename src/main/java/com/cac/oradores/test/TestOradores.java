package com.cac.oradores.test;

import com.cac.oradores.services.IOradorService;
import com.cac.oradores.services.impl.OradorService;

public class TestOradores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IOradorService oradores = new OradorService();
		/*
		oradores.agregarOrador("Cristian", "Dominguez", "La insdustria moderna de los videojuegos");
		oradores.agregarOrador("Silvina", "Fozek", "Ciberseguridad en linux");
		oradores.agregarOrador("Facundo", "Torres", "Realidad virtual en la industria quimica");
		
		System.out.println(oradores.listarOradores());
		
		oradores.eliminarOrador("Facundo", "Torres");
		*/
		System.out.println(oradores.listarOradores());
	}
}

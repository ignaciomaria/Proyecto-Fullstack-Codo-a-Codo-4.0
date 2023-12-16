package com.cac.oradores.test;

import com.cac.oradores.config.ConexionDB;

public class TestConexionDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConexionDB conexion = new ConexionDB();
		conexion.verificarConexion();
	}
}

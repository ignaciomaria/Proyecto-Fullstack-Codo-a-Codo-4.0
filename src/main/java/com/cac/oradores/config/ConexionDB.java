package com.cac.oradores.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String urlBD = "jdbc:mysql://localhost:3306/trabajo_final_CAC";
	private static final String user = "root";
	private static final String pass = "root";
	
	Connection conect = null;
	
	public ConexionDB() {
		try {
			//Registrar driver 
			Class.forName(driver);
			//Establecer conexion
			conect = DriverManager.getConnection(urlBD, user, pass);
		} catch (ClassNotFoundException cNFE) {
			// TODO: handle exception
			cNFE.printStackTrace();
		} catch (SQLException sqlE) {
			// TODO: handle exception
			sqlE.printStackTrace();
		}
	}
	
	//Traer conexion
	public Connection getConect() {
		return this.conect;
	}
	
	//Verificar conexion
	public void verificarConexion() {
		if(getConect() != null) {
			System.out.println("-------------------------------------------------");
			System.out.println("Conexion con la base de datos exitosa");
			System.out.println("-------------------------------------------------");
		}else {
			System.out.println("-------------------------------------------------");
			System.out.println("No se pudo conectar con la base de datos");
			System.out.println("-------------------------------------------------");
		}
	}
	
	//Cerrar conexion
	public void cerrarConexion() {
		if(conect != null) {
			try {
				conect.close();
			} catch (SQLException sqlE) {
				// TODO Auto-generated catch block
				sqlE.printStackTrace();
			}
		}
	}
}

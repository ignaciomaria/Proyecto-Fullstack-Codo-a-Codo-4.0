package com.cac.oradores.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cac.oradores.config.ConexionDB;
import com.cac.oradores.dao.IOradorDao;
import com.cac.oradores.entities.Orador;

public class OradorDao implements IOradorDao{
	
	public OradorDao() {}
	
	@Override
	public void addOrador(Orador orador) {
		// TODO Auto-generated method stub
		ConexionDB conexion = new ConexionDB();
		try (Statement estado = conexion.getConect().createStatement()){
			estado.executeUpdate("INSERT INTO ORADOR(NOMBRE, APELLIDO, TEMA)VALUES('"+orador.getNombre()+"','"
															+orador.getApellido()+"','"
															+orador.getTema()+"');");
		} catch (SQLException sqlE) {
			// TODO: handle exception
			throw new RuntimeException(sqlE);
		}finally {
			conexion.cerrarConexion();
		}
	}

	@Override
	public List<Orador> getOradores() {
		// TODO Auto-generated method stub
		List<Orador> oradores = new ArrayList<Orador>();
		ConexionDB conexion = new ConexionDB();
		try (Statement estado = conexion.getConect().createStatement()){
			ResultSet rs = estado.executeQuery("SELECT* FROM ORADOR;");
			Orador oradorAux;
			while(rs.next()) {
				oradorAux = new Orador(rs.getString(2), rs.getString(3), rs.getString(4));
				oradores.add(oradorAux);
			}
		}catch (SQLException sqlE) {
			// TODO: handle exception
			throw new RuntimeException(sqlE);
		}finally {
			conexion.cerrarConexion();
		}
		return oradores;
	}

	@Override
	public void deleteOrador(String nombre, String apellido) {
		// TODO Auto-generated method stub
		ConexionDB conexion = new ConexionDB();
		try (Statement estado = conexion.getConect().createStatement()){
			estado.executeUpdate("DELETE FROM ORADOR WHERE NOMBRE = '"+nombre+"' AND APELLIDO = '"
																	+apellido+"';");
		} catch (SQLException sqlE) {
			// TODO: handle exception
			throw new RuntimeException(sqlE);
		}finally {
			conexion.cerrarConexion();
		}
	}

}

package com.cac.oradores.dao;

import java.util.List;

import com.cac.oradores.entities.Orador;

public interface IOradorDao {

	public void addOrador(Orador orador);
	public List<Orador> getOradores();
	public void deleteOrador(String nombre, String apellido);
}

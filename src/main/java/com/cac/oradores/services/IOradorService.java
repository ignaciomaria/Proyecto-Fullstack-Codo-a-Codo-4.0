package com.cac.oradores.services;

import java.util.List;

import com.cac.oradores.entities.Orador;

public interface IOradorService {
	
	public void agregarOrador(String nombre, String apelido, String tema);
	public List<Orador> listarOradores();
	public void eliminarOrador(String nombre, String apellido);
}

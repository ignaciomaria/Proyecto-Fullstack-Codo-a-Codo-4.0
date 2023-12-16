package com.cac.oradores.services.impl;

import java.util.List;

import com.cac.oradores.dao.IOradorDao;
import com.cac.oradores.dao.impl.OradorDao;
import com.cac.oradores.entities.Orador;
import com.cac.oradores.services.IOradorService;

public class OradorService implements IOradorService{

	private IOradorDao oradorDao;
	
	public OradorService() {
		oradorDao = new OradorDao();
	}
	
	@Override
	public void agregarOrador(String nombre, String apelido, String tema) {
		// TODO Auto-generated method stub
		Orador nuevoOrador = new Orador(nombre, apelido, tema);
		oradorDao.addOrador(nuevoOrador);
	}

	@Override
	public List<Orador> listarOradores() {
		// TODO Auto-generated method stub
		return oradorDao.getOradores();
	}

	@Override
	public void eliminarOrador(String nombre, String apellido) {
		// TODO Auto-generated method stub
		oradorDao.deleteOrador(nombre, apellido);;
	}
}

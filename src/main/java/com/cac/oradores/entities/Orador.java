package com.cac.oradores.entities;

public class Orador {
	
	private String nombre;
	private String apellido;
	private String tema;
	
	public Orador(String nombre, String apellido, String tema) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tema = tema;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+"\nApellido: "+apellido+"\nTema: "+tema+"\n\n";
	}
}

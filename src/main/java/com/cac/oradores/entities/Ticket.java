package com.cac.oradores.entities;

public class Ticket {
	
	private String nombre;
	private String apellido;
	private String correo;
	private int cantidad;
	private String categoria;
	private int valor;
	
	public Ticket(String nombre, String apellido, String correo, int cantidad, String categoria, int valor) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.cantidad = cantidad;
		this.categoria = categoria;
		this.valor = valor;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+"\nApellido: "+apellido+"\nCorreo: "+correo+"\nCantidad: "+cantidad
				+"\nCategoria: "+categoria+"\nValor: "+valor+"\n\n";
	}
}

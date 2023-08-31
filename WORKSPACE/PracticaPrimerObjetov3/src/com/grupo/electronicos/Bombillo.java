package com.grupo.electronicos;

public class Bombillo {

	
	private String color = "BLANCA";
	private boolean encendido;
	private int lumens = 600;
	
	public void encender() {
		this.encendido = true;
	}
	
	public void apagar() {
		this.encendido = false;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	
}

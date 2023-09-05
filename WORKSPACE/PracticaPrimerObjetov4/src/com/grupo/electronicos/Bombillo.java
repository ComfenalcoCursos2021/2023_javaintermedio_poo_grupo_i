package com.grupo.electronicos;

public class Bombillo {

	
	private String color = "BLANCA";
	private boolean encendido = false;
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
	
	
}

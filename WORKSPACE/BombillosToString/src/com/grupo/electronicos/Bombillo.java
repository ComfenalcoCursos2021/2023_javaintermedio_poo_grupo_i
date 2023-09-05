package com.grupo.electronicos;

public class Bombillo {

	private Bombillo() {
		System.out.println("EL CONSTRUCTOR, GRACIAS POR VENIR");
	}
	public Bombillo(String elNombreDelBombillo) {
		System.out.println("EL CONSTRUCTOR CON TEXTO");
		this.nombre = elNombreDelBombillo;
	}
	public Bombillo(String elNombre, boolean estaEncendido) {
		System.out.println("EL CONSTRUCTOR CON ENCENDIDO");
		this.nombre= elNombre;
		this.encendido = estaEncendido;
	}
	
	private String nombre="";
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
	public String getNombre() throws Exception {
		if(this.nombre == null) {
			throw new Exception("Pongale un nombre al bombillo");
		}
		return nombre;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}	
	
	
	public String toString() {
		String retornar = "";
		String color = "";
		if(this.encendido) {
			retornar = "\u001B[32m=========== Bombillo /*"+this.nombre+"*/: Encendido =\u001B[0m";
			color = "\u001B[32m";
		} else {
			color = "\u001B[31m";
			retornar = "\u001B[31m=========== Bombillo /*"+this.nombre+"*/: Apagado ===\u001B[0m";
		}
		
		retornar = color + "********"+this.nombre + "\r\n";
		retornar = retornar + "***ESTADO: " +this.encendido +"\r\n";
		retornar = retornar + "***LUMENS: " +this.lumens+"\r\n";
		retornar = retornar + "***COLOR: " +this.color+"\r\n";
		retornar = retornar + "************************\u001B[0m";
		
		return retornar;
	}
	
}

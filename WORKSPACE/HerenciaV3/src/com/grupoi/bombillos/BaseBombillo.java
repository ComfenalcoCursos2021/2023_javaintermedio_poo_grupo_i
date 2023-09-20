package com.grupoi.bombillos;

public class BaseBombillo {
	protected String color;
	private int lumens;
	protected boolean encendido;
	private int voltaje;
	
	
	
	public void encender() {
		System.out.println("ENCENDIENDO DESDE LA BASE");
		this.encendido = true;
	}	
	public void apagar() {
		this.encendido = false;
	}	

	public boolean isEncendido() {
		return encendido;
	}
	public String getColor() {
		return color;
	}
	
	public int getLumens() {
		return lumens;
	}
	public void setLumens(int l) {
		this.lumens = l;
	}
	public int getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}	
	
	public String toString() {
		return "DESDE BASEBOMBILLO";
	}
	
	
}

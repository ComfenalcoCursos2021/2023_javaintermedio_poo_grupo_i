package com.grupoi.bombillos;

public class BaseBombillo {
	private String color;
	private int lumens;
	private boolean encendido;
	private int voltaje;
	
	public void encender() {
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
	public void setColor(String c) {
		this.color = c;
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

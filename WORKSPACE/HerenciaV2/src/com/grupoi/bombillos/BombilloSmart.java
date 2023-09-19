package com.grupoi.bombillos;

public class BombilloSmart extends BaseBombillo {

	private String nombreWifi;
	private String passwordWifi;
	private String clasificador;
	
	public String getNombreWifi() {
		return nombreWifi;
	}
	public void setNombreWifi(String nombreWifi) {
		this.nombreWifi = nombreWifi;
	}
	public String getPasswordWifi() {
		return passwordWifi;
	}
	public void setPasswordWifi(String passwordWifi) {
		this.passwordWifi = passwordWifi;
	}
	public String getClasificador() {
		return clasificador;
	}
	public void setClasificador(String clasificador) {
		this.clasificador = clasificador;
	}
	public String toString() {
		return "DESDE SMART";
	}
	
	public void encender() {
		System.out.println("ENCENDIENDO DESDE EL SMART");
		this.encendido = true;
	}
	
}

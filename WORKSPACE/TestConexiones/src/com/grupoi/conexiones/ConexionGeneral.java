package com.grupoi.conexiones;

public class ConexionGeneral {

	private String password;
	private String user;
	
	
	public void conectar() {
		System.out.println("CONECTANDO A LA BASE DE DATOS GENERICA");
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
}

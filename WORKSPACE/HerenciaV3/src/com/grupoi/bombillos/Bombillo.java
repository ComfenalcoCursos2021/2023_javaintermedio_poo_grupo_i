package com.grupoi.bombillos;

public class Bombillo extends BaseBombillo {
	
	
	
	public Bombillo(String colorCompra) {
		System.out.println("Constructor del normal");
		this.color = colorCompra;		
	}
	
	
	
	public String toString() {
		return "DESDE BOMBILLO";
	}
	public void encender() {
		System.out.println("ENCENDIENDO BOMBILLO NORMAL");
		this.encendido = true;
	}
}

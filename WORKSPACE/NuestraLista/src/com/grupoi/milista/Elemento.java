package com.grupoi.milista;


public class Elemento {

	private int dato;
	private Elemento siguiente;
	
	public Elemento(int valor) {
		this.dato = valor;
	}
	
	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Elemento getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Elemento nuevo) {
		this.siguiente = nuevo;
	}
	
	
	
	
}

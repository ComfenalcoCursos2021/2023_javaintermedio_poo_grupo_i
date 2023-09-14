package com.grupoi.arbol;

public class Nodo {
	
	private int numero;
	private Nodo menor;
	private Nodo mayor;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Nodo getMenor() {
		return menor;
	}
	public void setMenor(Nodo menor) {
		this.menor = menor;
	}
	public Nodo getMayor() {
		return mayor;
	}
	public void setMayor(Nodo mayor) {
		this.mayor = mayor;
	}	
}

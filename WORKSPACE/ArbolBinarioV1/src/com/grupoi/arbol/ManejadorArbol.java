package com.grupoi.arbol;

public class ManejadorArbol {
	
	private Nodo raiz;
	
	public void agregar(int dato) {
		if(raiz == null) {
			raiz = new Nodo();
			raiz.setNumero(dato);
		} else {
			agregar(raiz,dato);
		}
	}
	
	private void agregar(Nodo actual, int dato) {
		if(dato > actual.getNumero()) {
			if(actual.getMayor() == null) {
				Nodo nuevo = new Nodo();
				nuevo.setNumero(dato);
				actual.setMayor(nuevo);
			} else {
				agregar(actual.getMayor(), dato);
			}
		} else {
			if(actual.getMenor() == null) {
				Nodo nuevo = new Nodo();
				nuevo.setNumero(dato);
				actual.setMenor(nuevo);
			} else {
				agregar(actual.getMenor(),dato);
			}
		}
	}
	
	public void imprimir() {
		this.imprimirNodo(raiz);
	}
	
	private void imprimirNodo(Nodo nodo) {
		if(nodo.getMenor() != null) {
			imprimirNodo(nodo.getMenor());
		}
		System.out.println(nodo.getNumero());
		if(nodo.getMayor() != null) {
			imprimirNodo(nodo.getMayor());
		}
	}
	
	public void imprimirReverse() {
		this.imprimirNodoReverse(raiz);
	}
	
	private void imprimirNodoReverse(Nodo nodo) {
		if(nodo.getMayor() != null) {
			imprimirNodoReverse(nodo.getMayor());
		}
		System.out.println(nodo.getNumero());
		if(nodo.getMenor() != null) {
			imprimirNodoReverse(nodo.getMenor());
		}
		
	}
}

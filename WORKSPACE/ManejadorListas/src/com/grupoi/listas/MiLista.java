package com.grupoi.listas;


public class MiLista {
	
	private Elemento primerElemento;
	
	
	public void agregar(int dato) {
		if(primerElemento == null) {
			primerElemento = new Elemento(dato);
		} else {
			
			Elemento temporal = primerElemento;
			while(temporal.getSiguiente() != null) {
				temporal = temporal.getSiguiente();
			}						
			temporal.setSiguiente(new Elemento(dato));			
		}
	}
	public void imprimirPantalla() {
		Elemento temporal = primerElemento;
		while(temporal.getSiguiente() != null) {
			System.out.println(temporal.getDato());
			temporal = temporal.getSiguiente();
		}	
		System.out.println(temporal.getDato());
	}
	
}

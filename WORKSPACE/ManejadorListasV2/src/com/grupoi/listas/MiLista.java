package com.grupoi.listas;


public class MiLista {
	
	private CajaNegra primerElemento;
	
	
	public void agregar(int pepito) {
		if(primerElemento == null) {
			CajaNegra nueva = new CajaNegra();
			nueva.setDato(pepito);
			primerElemento = nueva;
		} else {
			
			CajaNegra temporal = primerElemento;
			while(temporal.getSiguiente() != null) {
				temporal = temporal.getSiguiente();
			}		
			CajaNegra nueva = new CajaNegra();
			nueva.setDato(pepito);
			temporal.setSiguiente(nueva);
			System.out.println("---------------");
		}
	}
	public void imprimirPantalla() {
		CajaNegra temporal = primerElemento;
		while(temporal.getSiguiente() != null) {
			System.out.println(temporal.getDato());
			temporal = temporal.getSiguiente();
		}	
		System.out.println(temporal.getDato());
	}
	
}

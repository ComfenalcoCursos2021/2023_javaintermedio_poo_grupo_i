package com.grupoi.listas;

public class MiLista {

	private CajaNegra primerElemento;
	private int contador;
	
	public void agregar(int pepito) {
		if (primerElemento == null) {
			CajaNegra nueva = new CajaNegra();
			nueva.setDato(pepito);
			primerElemento = nueva;
		} else {

			CajaNegra temporal = primerElemento;
			while (temporal.getSiguiente() != null) {
				temporal = temporal.getSiguiente();
			}
			CajaNegra nueva = new CajaNegra();
			nueva.setDato(pepito);
			temporal.setSiguiente(nueva);
			System.out.println("---------------");
		}
		this.contador++;
	}

	public void imprimirPantalla() {

		if (esVacia()) {
			System.out.println("No hay datos");
		} else {
			CajaNegra temporal = primerElemento;
			while (temporal.getSiguiente() != null) {
				System.out.println(temporal.getDato());
				temporal = temporal.getSiguiente();
			}
			System.out.println(temporal.getDato());
		}

	}
	
	public int cantElementosV2() {		
		return this.contador;
	}
	
	public int cantElementosV1() {
		int contador = 0;
		if(esVacia()) {
			return contador;
		}
		CajaNegra temporal = primerElemento;
		while (temporal.getSiguiente() != null) {
			contador++;
			temporal = temporal.getSiguiente();
		}
		
		return contador;
	}
	
	
	public boolean esVacia() {
		return primerElemento == null;
	}
	
	public void borrarUltimo() {

		CajaNegra temporal = primerElemento; // 1 2 3 4 5
		
		if(esVacia()) {
			
		} else if (temporal.getSiguiente() == null) {
			primerElemento = null;
			this.contador--;
		} else {
			while (temporal.getSiguiente().getSiguiente() != null) {
				temporal = temporal.getSiguiente();
			}

			temporal.setSiguiente(null);
			this.contador--;
		}
		
		System.out.println("Tú último dato no está");

	}

}

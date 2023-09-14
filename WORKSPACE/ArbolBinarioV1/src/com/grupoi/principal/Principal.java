package com.grupoi.principal;

import com.grupoi.arbol.ManejadorArbol;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManejadorArbol manejador = new ManejadorArbol();
		manejador.agregar(52);
		manejador.agregar(36);
		manejador.agregar(40);
		manejador.agregar(89);
		manejador.agregar(60);
		manejador.agregar(70);
		manejador.agregar(90);
		manejador.agregar(100);
		manejador.agregar(37);
		
		manejador.imprimir();
		System.out.println("============================");
		manejador.imprimirReverse();
	}

}

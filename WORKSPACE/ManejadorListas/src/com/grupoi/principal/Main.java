package com.grupoi.principal;

import com.grupoi.listas.manejador.ManejadorListas;

public class Main {

	public static void main(String[] args) {

		ManejadorListas m1 = new ManejadorListas();
		ManejadorListas m2 = new ManejadorListas();
		m1.inicialPrograma();
		System.out.println("/////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////");
		m2.inicialPrograma();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		m1.inicialPrograma();
		System.out.println("Termino!!!");

	}

}

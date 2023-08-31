package com.java.intermedio.main;

import com.grupoi.clases.GuardaNumero;

public class Lanzador {

	public static void main(String[] args) {
		System.out.println("Bienvenida");
		
		GuardaNumero primera = new GuardaNumero();		
		
		primera.setElGuardado(55);			
		
		System.out.println(primera.getElGuardado());
		
		System.out.println("Termino!!");
	}
}

package com.grupoi.main;

import com.grupoi.milista.Elemento;

public class Main {

	public static void main(String[] args) {
		Elemento a = new Elemento(10);
		Elemento b = new Elemento(20);
		Elemento c = new Elemento(30);
		Elemento d = new Elemento(40);

		System.out.println("empezando");
		a.setSiguiente(b);
		b.setSiguiente(c);
		c.setSiguiente(d);
		
		Elemento temporal = a;
		
		while (temporal.getSiguiente() != null) {
			System.out.println("--->" + temporal.getDato());
			temporal = temporal.getSiguiente();
		}
		System.out.println("--->" + temporal.getDato());

		System.out.println("termino");
	}

}

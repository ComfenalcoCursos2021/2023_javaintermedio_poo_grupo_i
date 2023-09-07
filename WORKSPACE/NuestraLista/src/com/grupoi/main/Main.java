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
		
		
		a.getSiguiente().getSiguiente().getSiguiente().getDato();
		b.getSiguiente().getSiguiente().getDato();
		c.getSiguiente().getDato();
		
		System.out.println("termino");
	}

}

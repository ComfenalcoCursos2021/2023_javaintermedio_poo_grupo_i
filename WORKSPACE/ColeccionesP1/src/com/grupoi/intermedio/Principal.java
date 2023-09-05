package com.grupoi.intermedio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenida!!");
		Scanner teclado = new Scanner(System.in);
		System.out.println("De que tamaño quiere el vector");
		int tamanio = teclado.nextInt();
		int[] a = new int[tamanio];
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(67);
		b.add(98);
		b.add(null);
		b.add(25898);
		b.add(87);
		for (Integer datoActual : b) {
			System.out.println(datoActual);
		}
		System.out.println("=========================");
		a[2]= 99;
		for (int i = 0; i < tamanio; i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("Termino!!");

	}

}

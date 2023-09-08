package com.grupoi.listas.manejador;

import java.util.Scanner;

import com.grupoi.listas.MiLista;

public class ManejadorListas {

	private Scanner TECLADO = new Scanner(System.in);
	private MiLista lista = new MiLista();
	private String aviso = "";

	private void menu() {
		System.out.println("===================================");
		System.out.println("==============LISTAS===============");
		System.out.println("===================================");
		System.out.println("=========1. AGREGAR================");
		System.out.println("=========2. IMPRIMIR===============");
		System.out.println("=========3. BORRAR ULTIMO==========");
		System.out.println("===================================");
		System.out.println("=========9. SALIR==================");
		System.out.println("===================================");
	}

	private void imprimirAviso() {
		System.out.println("===================================");
		System.out.println("=  " + aviso);
		System.out.println("===================================");

	}

	public void inicialPrograma() {
		int opcion = 99;
		while (opcion != 9) {
			menu();
			imprimirAviso();
			System.out.println("Que desea hacer?");
			opcion = TECLADO.nextInt();
			
			if(opcion == 1) {
				agregarALista();
			} else if(opcion == 2) {
				imprimirLista();
			}
			
		}
	}
	private void imprimirLista() {
		lista.imprimirPantalla();
	}
	private void agregarALista() {
		System.out.println("Que numero quiere agregar?");
		int nuevo = TECLADO.nextInt();
		lista.agregar(nuevo);
		aviso = "AGREGADO CON EXITO!!";
	}

}

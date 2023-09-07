package com.grupo.manuela.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static Scanner TECLADO = new Scanner(System.in);
	public static String AVISO = "";

	public static void limpiador() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void menu() {
		System.out.println("******Bienvenido!!***********");
		System.out.println("*****************************");
		System.out.println("**********MENU***************");
		System.out.println("*****************************");
		System.out.println("*****1. AGREGAR**************");
		System.out.println("*****2. IMPRIMIR*************");
		System.out.println("*****3. BORRAR EL ULTIMO*****");
		System.out.println("*****************************");
		System.out.println("*****4. SALIR****************");
		System.out.println("*****************************");
		System.out.println("\033[0;35m" + AVISO + "\033[0m");
		System.out.println("-----------------------------");
	}

	/*
	 * public void aviso (String aviso) { System.out.println("*");
	 * System.out.println("*"); System.out.println("*"); System.out.println("*");
	 * System.out.println("*******"+ aviso + "*********");
	 * System.out.println("-----------------------------"); }
	 */

	public static void agregarElemento(List<Integer> paraAgregar) {

		System.out.println("AGREGANDO");
		System.out.println("Que numero quiere agregar?");
		int numero = TECLADO.nextInt();

		paraAgregar.add(numero);
		// System.out.println("GUARDADO CON EXITO!");
		AVISO = "EXCELENTE, NUMERO GUARDADO CON EXITO!";

	}

	private static void imprimirLista(List<Integer> paraImprimir) {
		// foreach para que recorra cada punto de la lista y lo imprima
		
		String temporal = "";
		
		for (Integer item : paraImprimir) {
			temporal = temporal + "--->"+item+"\r\n";			
		}
		AVISO = temporal;
	}

	public static void borrarUltimo(List<Integer> paraBorrarUltimo) {
		int cuantosElementos = paraBorrarUltimo.size();
		paraBorrarUltimo.remove(cuantosElementos - 1);
		// System.out.println("Borrados con exito!!!");
		AVISO = "Borrado con exito!!!";
	}

	public static void main(String[] args) {
		// System.out.println("Bienvenida!!");

		List<Integer> lista = new ArrayList<Integer>(); // para crear una lista en una variable(en memoria)

		int opcion = 99;
		while (opcion != 9) {
			limpiador();
			menu();
			System.out.println("¿Que desea hacer?");
			opcion = TECLADO.nextInt();

			/*
			 * if(opcion == 1) { agregarElemento(lista); } if (opcion == 2) {
			 * imprimirLista(lista); } if(opcion == 3) { borrarUltimo(lista); }
			 */

			switch (opcion) {

			case 1:
				agregarElemento(lista);
				break;
			case 2:
				imprimirLista(lista);
				// En esta parte es donde quiero utilizar el metodo get
				break;
			case 3:
				borrarUltimo(lista);
				break;

			case 4:
				break;

			default:
				System.out.println("Ingrese una opcion valida");
				break;
			}
		}
		System.out.println("Termino!!");

	}

}

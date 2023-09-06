package com.grupoi.intermedio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static Scanner TECLADO = new Scanner(System.in); 
	
	
	public static void limpiador() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void menu() {
		System.out.println("*****************************");
		System.out.println("************MENU*************");
		System.out.println("*****************************");
		System.out.println("*****1. AGREGAR**************");
		System.out.println("*****2. IMPRIMIR*************");
		System.out.println("*****3. BORRAR EL ULTIMO*****");
		System.out.println("*****************************");
		System.out.println("*****9. SALIR****************");
		System.out.println("*****************************");
	}
	
	
	public static void agregarElemento(List<Integer> paraAgregar) {
				
		System.out.println("AGREGANDO");
		System.out.println("Que numero quiere agregar?");
		int numero = TECLADO.nextInt();
		
		paraAgregar.add(numero);
		System.out.println("GUARDADO CON EXITO!");
		
	}
	public static void imprimirLista(List<Integer> paraImprimir) {
		
		for (Integer item : paraImprimir) {
			System.out.println("--->"+item);
		}
	}
	
	public static void borrarUltimo(List<Integer> paraBorrarUltimo) {		
		int cuantosElementos = paraBorrarUltimo.size();		
		paraBorrarUltimo.remove(cuantosElementos-1);
		System.out.println("Borrados con exito!!!");
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenida!!");
		
		List<Integer> lista = new ArrayList<Integer>();
		
		int opcion = 99;
		while (opcion != 9) {
			limpiador();
			menu();
			System.out.println("Que desea hacer?");
			opcion = TECLADO.nextInt();
			
			switch (opcion) {
			
			case 1:				
				agregarElemento(lista);
				break;
			case 2:
				imprimirLista(lista);
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

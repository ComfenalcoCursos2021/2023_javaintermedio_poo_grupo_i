package com.grupoi.main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static Scanner TECLADO = new Scanner(System.in);

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
		
	}
	

	public static void main(String[] args) {

		int opcion = 99;

		while (opcion != 9) {
			limpiador();
			menu();
			System.out.println("Que desea hacer?");
			opcion = TECLADO.nextInt();			
			switch (opcion) {
			case 1:
				funcionAgregar();
				break;
			default:
				break;
			}
		}

		System.out.println("Termino!!!");

	}
	
	
	public static void menuAgregar() {
		System.out.println("*****************************");
		System.out.println("******AGREGANDO**************");
		System.out.println("*****************************");
		
		
	}
	
	public static void funcionAgregar() {
		int opcionAgregar = 99;
		while(opcionAgregar != 9) {
			limpiador();
			menuAgregar();
			System.out.println("Que numero quiere agreagar");
			int nuevoNumero = TECLADO.nextInt();
			
			System.out.println("Esta seguro?");
			System.out.println("1. SI    2. NO");
			opcionAgregar = TECLADO.nextInt();
			if(opcionAgregar == 1) {
				System.out.println("AGREGAMOS");
				limpiador();
				opcionAgregar = 9;
			} else if (opcionAgregar == 2) {
				System.out.println("Que desea hacer?");
				System.out.println("1. INTERGAR AGREGAR NUEVAMENTE");
				System.out.println("2. VOLVER AL MENU PRINCIPAL");
				
				opcionAgregar = TECLADO.nextInt();
				if(opcionAgregar == 1) {
										
				} else if(opcionAgregar == 2) {
					limpiador();
					opcionAgregar = 9;
				} 
				
			}
		}
	}
}

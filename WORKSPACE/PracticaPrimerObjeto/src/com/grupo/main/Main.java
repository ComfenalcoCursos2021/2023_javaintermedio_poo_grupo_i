package com.grupo.main;

import java.util.Scanner;

import com.grupo.electronicos.Bombillo;

public class Main {

	public static void menu() {
		System.out.println("=================================");
		System.out.println("===========menu principal========");
		System.out.println("=================================");
		System.out.println("===========1. encender===========");
		System.out.println("===========2. Apagar=============");
		System.out.println("===========3. Salir==============");
		System.out.println("=================================");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenida");
		Bombillo normal = new Bombillo();
		Scanner teclado = new Scanner(System.in);
		
		int opcion = 99;
		
		while(opcion != 3) {
			menu();
			System.out.println("Que quiere hacer?");
			opcion = teclado.nextInt();
			
			if(opcion == 1) {				
				if(normal.isEncendido()) {
					System.err.println("YA ESTA ENCENDIDO!!!!");
				} else {
					normal.encender();
					System.out.println("Lo encendio");	
				}
				
			}
			if(opcion == 2) {				
				if(normal.isEncendido()) {
					normal.apagar();
					System.out.println("Lo apago");	
				} else {
					System.err.println("YA ESTA APAGADO!!!!");
				}
				
				
			}	
			
			
		}
		
			
		
		
		System.out.println("Termino");

	}

}

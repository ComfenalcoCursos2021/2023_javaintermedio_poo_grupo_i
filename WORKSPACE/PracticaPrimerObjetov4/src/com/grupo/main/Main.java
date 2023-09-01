package com.grupo.main;

import java.io.IOException;
import java.util.Scanner;

import com.grupo.electronicos.Bombillo;

public class Main {

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
	
	public static void menu(boolean estaEncendido) {		
		System.out.println("=================================");
		System.out.println("===========MENU PRINCIPAL========");
		System.out.println("=================================");
		
		System.out.println("===========1. Encender ½=========");	
		System.out.println("===========2. Apagar=============");		
		System.out.println("===========3. Salir==============");
		System.out.println("=============================v8==");		
	}
	
	public static void mensaje(String mensaje) {
		
		System.out.println("*                                ");
		System.out.println("*"+ mensaje);
		System.out.println("*                                ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenida");
		Bombillo normal = new Bombillo();
		Scanner teclado = new Scanner(System.in);
		String elMensaje="";
		int opcion = 99;
		
		while(opcion != 3) {
			limpiador();
			menu(normal.isEncendido());
			mensaje(elMensaje);
			if(!normal.isEncendido())
				System.out.println("\u001B[31m=========== Bombillo: Apagado ===\u001B[0m");				
			if(normal.isEncendido())
				System.out.println("\u001B[32m=========== Bombillo: Encendido =\u001B[0m");
			System.out.println("Que quiere hacer?");
			opcion = teclado.nextInt();
			
			if(opcion == 1) {				
				if( normal.isEncendido() == true ) {
					
					elMensaje = "YA ESTA ENCENDIDO Y SI LO ENCIENDE MAS DE 3 VECES SEGUIDAS ENTRARA EN MODO DE EMERGENCIA!!!!";
				} else {	
					normal.encender();
					elMensaje = "Lo encendio";					
				}
				
			}
			if(opcion == 2) {				
				if(normal.isEncendido()) {					
					normal.apagar();					
					elMensaje = "Lo apago";	
				} else {
					elMensaje = "YA ESTA APAGADO, RECUERDE QUE EL MECANISMO DE EMERGENCIA DE ESTA CLASE DE BOMBILLOS SE ACTIVA UNICAMENTE SI SE INTENTA ENCENDER MAS DE 5 VECES SEGUIDAS, LO QUE DESENCADEARA QUE EL BOBILLO PARAPADE CONSTANTEMENTE !!!!";
				}				
			}			
			
		}
		
			
		
		
		System.out.println("Termino");

	}

}

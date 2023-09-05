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
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Bienvenida");
		
		Bombillo normal1 = new Bombillo("abc",true);
		Bombillo normal2 = new Bombillo("123",true);
		
		
		System.out.println(normal1);
		System.out.println(normal2);
			
		
		
		System.out.println("Termino");

	}

}

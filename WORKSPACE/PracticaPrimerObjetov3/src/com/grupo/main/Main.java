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
		System.out.println("===========menu principal========");
		System.out.println("=================================");

		System.out.println("===========1. Encender ½=========");
		System.out.println("===========2. Apagar=============");
		System.out.println("===========3. Salir==============");
		System.out.println("=============================v6==");

	}

	public static void main(String[] args) {

		System.out.println("Bienvenida");
		Bombillo normal = new Bombillo();
		Scanner teclado = new Scanner(System.in);

		int opcion = 99;

		while (opcion != 3) {
			// limpiador();
			menu(normal.isEncendido());
			System.out.println("Que quiere hacer?");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1: {

				if (normal.isEncendido()) {
					System.err.println("YA ESTA ENCENDIDO!!!!");
				} else {
					normal.encender();
					System.out.println("Lo encendio");
				}
			}
			case 2: {

				if (normal.isEncendido()) {
					normal.apagar();
					System.out.println("Lo apago");
				} else {
					System.err.println("YA ESTA APAGADO!!!!");
				}

			}

			}

			System.out.println("Ingrese el numero 4 para continuar...");
			char x = teclado.next().charAt(0);

		}

		System.out.println("Termino");

	}

}

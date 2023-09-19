package com.grupoi.main;

public class Main {

	public static void imprimirLetras(int numero) {

		if (numero == 1) {
			System.out.println("Uno");
		} else {
			if (numero == 2) {
				System.out.println("Dos");
			} else {
				if (numero == 3) {
					System.out.println("Tres");
				} else {
					if (numero == 4) {
						System.out.println("Cuatro");
					} else {
						if (numero == 5) {
							System.out.println("Cinco");
						}
					}
				}

			}

		}

		if (numero == 1) {
			System.out.println("Uno");
		} else if (numero == 2) {
			System.out.println("Dos");
		} else if (numero == 3) {
			System.out.println("Tres");
		} else if (numero == 4) {
			System.out.println("Cuatro");
		} else if (numero == 5) {
			System.out.println("Cinco");
		}
	}

	public static void main(String[] args) {

		imprimirLetras(5);
		imprimirLetras(3);
		imprimirLetras(1);
		imprimirLetras(2);

	}

}

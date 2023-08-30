package com.alvaro.ope.matematicas;

import java.util.Scanner;

public class OperacionesMatematicas {
	
	public int sumaDosNumeros(int numero1, int numero2) {
		int suma;
		suma = numero1 + numero2;
		return suma;
	} 
	
	public void sumaDosNumerosJuego() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int numero1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int numero2 = teclado.nextInt();
		
		System.out.println("La respuesta es " + (numero1+numero2));
	} 
	
	public int restaDosNumeros(int numero1, int numero2) {
		int r;
		r = numero1 - numero2;
		return r;
	} 
}

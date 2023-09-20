package com.grupoi.manejadores;

public class PolimorfismoTest {

	public void imprimeSuma(int a, int b) {
		System.out.println("Suma de enteros -> " +(a+b));
	}
	public void imprimeSuma(int a, int b, int c) {
		System.out.println("Suma de enteros -> " +(a+b+c));
	}
	public void imprimeSuma(double a, double b) {
		System.out.println("Suma de doubles -> " +(a+b));
	}
}

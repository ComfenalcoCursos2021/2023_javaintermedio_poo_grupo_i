package com.grupoi.principal;

import com.grupoi.recursividad.FuncionesRecursivas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
		FuncionesRecursivas fun = new FuncionesRecursivas();

		int respuesta = fun.factorialRecursivo(numero);
		System.out.println("El factorial de " + numero + " es " + respuesta);

		System.out.println("Termino!!");
	}

}

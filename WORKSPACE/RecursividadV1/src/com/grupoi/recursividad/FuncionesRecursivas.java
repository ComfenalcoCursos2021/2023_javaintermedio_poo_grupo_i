package com.grupoi.recursividad;

public class FuncionesRecursivas {

	public int factorialNormal(int numero) {
		int resultado = 1;
		for (int i = 2; i <= numero; i = i + 1) {
			resultado = resultado * i;
		}		
		return resultado;
	}
	public int factorialRecursivo(int numero) {
		if(numero == 1) {
			return 1;
		}
		return numero * factorialRecursivo(numero-1);
	}

}

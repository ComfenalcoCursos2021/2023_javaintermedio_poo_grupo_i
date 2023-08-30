package com.alvaro.principal;

import com.alvaro.ope.matematicas.*;

public class Partida {

	
	public static void main(String[] arg) {
		
		System.out.print("Mensaje de bienvenida \r\n");
		
		OperacionesMatematicas primeraInstancia = new OperacionesMatematicas();		
		
		int respuesta = primeraInstancia.sumaDosNumeros(15, 45);
		
		System.out.println(respuesta);
		
		System.out.println(primeraInstancia.sumaDosNumeros(15,15));
		primeraInstancia.sumaDosNumerosJuego();
		System.out.print("Despedida!!!!");
		
		
	}
}

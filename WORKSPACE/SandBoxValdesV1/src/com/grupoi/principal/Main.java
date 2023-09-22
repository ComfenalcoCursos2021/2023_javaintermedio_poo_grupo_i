package com.grupoi.principal;

import com.grupoi.basedatos.BaseDatosValdes;
import com.grupoi.basedatos.EstadoValdes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDatosValdes base = new BaseDatosValdes();
		EstadoValdes a = new EstadoValdes(2, 3);
		EstadoValdes b = new EstadoValdes(2, 4);
		
		base.agregar(a);
		base.agregar(b);
		base.agregar(2,9);
		
		
		boolean respuesta = base.esta(2,9);
		if(respuesta) {
			System.out.println("Si estaba");
		} else {
			System.out.println("No estaba");
		}

		System.out.println("Termino!!!");

	}

}

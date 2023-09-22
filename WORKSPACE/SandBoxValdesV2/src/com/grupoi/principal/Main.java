package com.grupoi.principal;

import com.grupoi.basedatos.EstadoValdes;
import com.grupoi.manejadores.ManejadorValdes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int capacidadV1 = 3;
		int capacidadV2 = 5;
		ManejadorValdes manager = new ManejadorValdes();
		
		manager.setCapacidadV1(capacidadV1);
		manager.setCapacidadV2(capacidadV2);

		
		EstadoValdes a = new EstadoValdes(0, 0);
		System.out.println(a);
		manager.llenarV1(a);
		System.out.println(a);
		System.out.println("-------------------------------");
		EstadoValdes b = new EstadoValdes(0, 0);
		System.out.println(b);
		EstadoValdes c = manager.llenarV1SinTocar(b);
		System.out.println("-------------------------------");
		System.out.println(b);
		System.out.println(c);
		
		EstadoValdes d = manager.pasarV1aV2SinTocar(c);
		System.out.println(d);
		System.out.println("Termino!!!");

	}

}

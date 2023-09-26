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
		EstadoValdes f = manager.llenarV2SinTocar(b);
		System.out.println("-----------------probando llenar--------------");
		System.out.println(b);
		System.out.println(c);
		System.out.println(f);
		System.out.println("-------------------------------");
		EstadoValdes d = manager.pasarV1aV2SinTocar(c);
		System.out.println(d);
		System.out.println("-------------------------------");
		EstadoValdes g = new EstadoValdes(0, 5);
		EstadoValdes h = manager.pasarV2aV1sintocar(g);
		
		System.out.println(g);
		System.out.println(h);
		System.out.println("__________________________________");
		System.out.println(manager.getCapacidadV1());
		EstadoValdes i = manager.VaciarV1Sintocar(h);
		System.out.println(h);
		System.out.println(i);
		manager.VaciarV2(i);
		System.out.println(i);
		System.out.println(manager.getCapacidadV1());
		System.out.println("Termino!!!");

	}

}

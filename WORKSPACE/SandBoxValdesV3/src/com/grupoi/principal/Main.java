package com.grupoi.principal;

import java.util.Scanner;

import com.grupoi.basedatos.Camino;
import com.grupoi.basedatos.EstadoValdes;
import com.grupoi.manejadores.ManejadorCaminos;
import com.grupoi.manejadores.ManejadorValdes;
import com.grupoi.manejadores.SolucionadorValdes;

public class Main {

	public static void main(String[] args) {

		//testMetodosLlenado();
		//testCamino();
		//testManejadorCaminos();
		//testProcesarSiEsMeta();
		testSolucionar();
		System.out.println("Termino!!!");

	}
	public static void testSolucionar() {
		SolucionadorValdes b = new SolucionadorValdes();
		b.solucionar(5, 3, 4);
	}
	public static void testProcesarSiEsMeta() {
		Scanner in = new Scanner(System.in);
		int meta = in.nextInt();	
		EstadoValdes c = new EstadoValdes(3, 4);
		
		if(c.isMeta(meta)) {
			System.out.println("LLEGO A LA META");
		} else {
			System.out.println("NO LLEGO");
		}
		
		
	}
	
	
	public static void testManejadorCaminos() {
		ManejadorCaminos mng = new ManejadorCaminos();
		mng.crearCamino(0,0);
		mng.crearCamino(6,0);
		mng.crearCamino(0,6);
		
		mng.getCaminos().get(1).agregar(9, 9);
		for(Camino elemento : mng.getCaminos()) {
			System.out.println("-----------------------------------");
			elemento.imprimir();
			System.out.println("-----------------------------------");
		}
	}
	public static void testCamino() {
		Camino c = new Camino();
		Camino d = new Camino();
		d.agregar(9,10);
		c.agregar(4, 5);
		c.agregar(4, 0);
		c.agregar(0, 3);
		
		c.imprimir();
		System.out.println("-----------------------------------");
		
		d.imprimir();
	}
	
	
	
	public static void testMetodosLlenado() {
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
	}

}

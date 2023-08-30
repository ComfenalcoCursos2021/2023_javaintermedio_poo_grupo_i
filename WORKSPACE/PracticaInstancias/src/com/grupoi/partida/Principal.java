package com.grupoi.partida;

import com.grupoi.clases.GuardaNumero;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenida");
		
		GuardaNumero a = new GuardaNumero();
		GuardaNumero b = new GuardaNumero();
		
		
		GuardaNumero.COMUN = 99;
		System.out.println(a.elGuardado + " - " + GuardaNumero.COMUN);
		GuardaNumero.COMUN = 100;
		a.elGuardado = 5;
		System.out.println(a.elGuardado + " - " + GuardaNumero.COMUN);
		
		System.out.println("->" + b.elGuardado  + " - " + GuardaNumero.COMUN);
		GuardaNumero.COMUN = 120;
		b.elGuardado = 15;
		System.out.println("->" + b.elGuardado + " - " + GuardaNumero.COMUN);
		System.out.println("--------antes de reasignar las flechas-------");
		b = a;
		System.out.println("--> " + b.elGuardado + " - " + b.COMUN); // todos dijeron que imprimia 5
		a.elGuardado = 15;
		
		System.out.println("---> " + b.elGuardado + " - " + b.COMUN); // 5 - 15
		
		int a1 = 5;
		int b1 = 15;
		System.out.println("### "+a1);
		System.out.println("### "+b1);
		b1 = a1;
		System.out.println("### "+b1);
		a1 = 99;
		System.out.println("/// "+b1); 
		
		System.out.println("Termino!!");
		
		
	}

}

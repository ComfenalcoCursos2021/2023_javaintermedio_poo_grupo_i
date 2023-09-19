package com.grupoi.principal;

import com.grupoi.bombillos.Bombillo;
import com.grupoi.bombillos.BombilloSmart;
import com.grupoi.bombillos.BombilloSmartConSensor;
import com.grupoi.manejadores.EncendedorManejador;
import com.grupoi.manejadores.PolimorfismoTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bombillo primer = new Bombillo();
		BombilloSmart bSmart = new BombilloSmart();
		BombilloSmartConSensor bSensor = new BombilloSmartConSensor();

		EncendedorManejador manejador = new EncendedorManejador();

		manejador.encenderBombillo(primer);// primer.encender();
		manejador.encenderBombillo(bSmart);// bSmart.encender();
		manejador.encenderBombillo(bSensor);// bSensor.encender();

		System.out.println("-Normal>" + (primer.isEncendido() ? "Si" : "No"));
		System.out.println("-Smart>" + (bSmart.isEncendido() ? "Si" : "No"));
		System.out.println("-Sensor>" + (bSensor.isEncendido() ? "Si" : "No"));

		manejador.apagarBombillo(bSmart);
		System.out.println("_____________________________________________");

		System.out.println("-Normal>" + (primer.isEncendido() ? "Si" : "No"));
		System.out.println("-Smart>" + (bSmart.isEncendido() ? "Si" : "No"));
		System.out.println("-Sensor>" + (bSensor.isEncendido() ? "Si" : "No"));

		manejador.limpiarNamePassWordWifi(bSensor);
		manejador.limpiarNamePassWordWifi(bSmart);
		System.out.println("_____________________________________________");
		System.out.println(primer);
		System.out.println(bSmart);
		System.out.println(bSensor);
		System.out.println("_____________________________________________");
		manejador.imprimirBombillo(primer);
		manejador.imprimirBombillo(bSmart);
		manejador.imprimirBombillo(bSensor);

		PolimorfismoTest t = new PolimorfismoTest();
		int x = 5;
		int y = 6;
		double x1 = 5.6;
		double y1 = 6.6;
		t.imprimeSuma(x, y);
		
		t.imprimeSuma(x1, y1);

		System.out.println("Termino");
	}

}

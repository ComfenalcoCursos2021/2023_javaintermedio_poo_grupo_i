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
		System.out.println("=================");
		manejador.encenderBombillo(primer);// primer.encender();
		System.out.println("=================");
		manejador.encenderBombillo(bSmart);// bSmart.encender();
		System.out.println("=================");
		manejador.encenderBombillo(bSensor);// bSensor.encender();
		System.out.println("=================");

		System.out.println("-Normal>" + (primer.isEncendido() ? "Si" : "No"));
		System.out.println("-Smart>" + (bSmart.isEncendido() ? "Si" : "No"));
		System.out.println("-Sensor>" + (bSensor.isEncendido() ? "Si" : "No"));


		System.out.println("Termino");
	}

}

package com.grupoi.principal;

import com.grupoi.bombillos.Bombillo;
import com.grupoi.bombillos.BombilloSmart;
import com.grupoi.bombillos.BombilloSmartConSensor;
import com.grupoi.manejadores.EncendedorManejador;
import com.grupoi.manejadores.PolimorfismoTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		Bombillo primer = new Bombillo("Azul");
		System.out.println("------------------------------------");
		BombilloSmart bSmart = new BombilloSmart();
		System.out.println("------------------------------------");
		BombilloSmartConSensor bSensor = new BombilloSmartConSensor();
		System.out.println("------------------------------------");
		
		
		
		System.out.println("COLOR primer -> " + primer.getColor());
		System.out.println("COLOR SMART -> " + bSmart.getColor());		
		System.out.println("COLOR bSensor -> " + bSensor.getColor());
		
		
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

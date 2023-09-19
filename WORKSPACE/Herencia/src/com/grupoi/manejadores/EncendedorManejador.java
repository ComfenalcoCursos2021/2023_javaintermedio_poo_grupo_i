package com.grupoi.manejadores;

import com.grupoi.bombillos.BaseBombillo;
import com.grupoi.bombillos.BombilloSmart;

public class EncendedorManejador {

	
	public void imprimirBombillo(BaseBombillo b) {
		System.out.println("****************************");
		System.out.println("***** " + b);
		System.out.println("****************************");
	}
	
	public void encenderBombillo(BaseBombillo b) {
		b.encender();
	}
	
	public void apagarBombillo(BaseBombillo b) {
		b.apagar();
	}
	
	public void limpiarNamePassWordWifi(BombilloSmart b) {
		b.setPasswordWifi("");
		b.setNombreWifi("");
	}
}

package com.grupoi.manejadores;

import com.grupoi.basedatos.EstadoValdes;

public class ManejadorValdes {

	private int capacidadV1;
	private int capacidadV2;
	
	public int getCapacidadV1() {
		return capacidadV1;
	}
	public void setCapacidadV1(int capacidadV1) {
		this.capacidadV1 = capacidadV1;
	}
	public int getCapacidadV2() {
		return capacidadV2;
	}
	public void setCapacidadV2(int capacidadV2) {
		this.capacidadV2 = capacidadV2;
	}
	
	public void llenarV1(EstadoValdes cualquiera) {
		cualquiera.setContenidoV1(this.capacidadV1);
	}
	
	public EstadoValdes llenarV1SinTocar(EstadoValdes cualquiera) {
		EstadoValdes elNuevo = new EstadoValdes();
		elNuevo.setContenidoV1(cualquiera.getContenidoV1());
		elNuevo.setContenidoV2(cualquiera.getContenidoV2());		
		elNuevo.setContenidoV1(this.capacidadV1);		
		return elNuevo;
	}
	
	
	public EstadoValdes pasarV1aV2SinTocar(EstadoValdes cualquiera) {
		EstadoValdes elNuevo = new EstadoValdes();
		elNuevo.setContenidoV1(cualquiera.getContenidoV1());
		elNuevo.setContenidoV2(cualquiera.getContenidoV2());				
		
		this.pasarV1aV2(elNuevo);
		
		return elNuevo;
	}
	public void pasarV1aV2(EstadoValdes cualquiera) {
		int capacidadPasar = this.capacidadV2 - cualquiera.getContenidoV2();	
		int cuantoPasar = 0;
		
		if(cualquiera.getContenidoV1() < capacidadPasar) {
			cuantoPasar = cualquiera.getContenidoV1(); 
		} else {
			cuantoPasar = capacidadPasar;
		}
		
		cualquiera.setContenidoV1(cualquiera.getContenidoV1() - cuantoPasar);		
		cualquiera.setContenidoV2(cualquiera.getContenidoV2() + cuantoPasar);
	}
	
}

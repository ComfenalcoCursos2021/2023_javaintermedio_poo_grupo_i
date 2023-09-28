package com.grupoi.manejadores;

import com.grupoi.basedatos.EstadoValdes;

public class ManejadorValdes {

	private int capacidadV1;
	private int capacidadV2;
	
	public ManejadorValdes(int c1, int c2) {
		this.capacidadV1 = c1;
		this.capacidadV2 = c2;
	}
	public int getCapacidadV1() {
		return capacidadV1;
	}	
	public int getCapacidadV2() {
		return capacidadV2;
	}	
	
	
	public void vaciarV1(EstadoValdes cualquiera) {
		cualquiera.setContenidoV1(0);
	}
	public EstadoValdes vaciarV1SinTocar(EstadoValdes cualquiera ) {
		EstadoValdes elNuevo = new EstadoValdes();
		elNuevo.setContenidoV1(cualquiera.getContenidoV1());
		elNuevo.setContenidoV2(cualquiera.getContenidoV2());
		this.vaciarV1(elNuevo);
		return elNuevo;
	}
	
	public void vaciarV2(EstadoValdes cualquiera) {
		cualquiera.setContenidoV2(0);
	}
	
	public EstadoValdes vaciarV2SinTocar(EstadoValdes cualquiera ) {
		EstadoValdes elNuevo = new EstadoValdes();
		elNuevo.setContenidoV1(cualquiera.getContenidoV1());
		elNuevo.setContenidoV2(cualquiera.getContenidoV2());
		this.vaciarV2(elNuevo);
		return elNuevo;
	}
	
	
	public void llenarV2(EstadoValdes cualquiera) {
		cualquiera.setContenidoV2(this.capacidadV2);
	}
	
	public EstadoValdes llenarV2SinTocar(EstadoValdes cualquiera) {
		EstadoValdes elNuevo = new EstadoValdes();
		elNuevo.setContenidoV1(cualquiera.getContenidoV1());
		elNuevo.setContenidoV2(cualquiera.getContenidoV2());		
		this.llenarV2(elNuevo);	
		return elNuevo;
	}	
	public void llenarV1(EstadoValdes cualquiera) {
		cualquiera.setContenidoV1(this.capacidadV1);
	}
	
	public EstadoValdes llenarV1SinTocar(EstadoValdes cualquiera) {
		EstadoValdes elNuevo = new EstadoValdes();
		elNuevo.setContenidoV1(cualquiera.getContenidoV1());
		elNuevo.setContenidoV2(cualquiera.getContenidoV2());		
		this.llenarV1(elNuevo);
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
	public EstadoValdes pasarV2aV1SinTocar(EstadoValdes cualquiera) {
		EstadoValdes elNuevo = new EstadoValdes();
		elNuevo.setContenidoV2(cualquiera.getContenidoV2());
		elNuevo.setContenidoV1(cualquiera.getContenidoV1());		
		this.pasarV2aV1(elNuevo);		
		return elNuevo;
	}
	public void pasarV2aV1(EstadoValdes cualquiera) {
		int capacidadPasar = this.capacidadV1 - cualquiera.getContenidoV1();	
		int cuantoPasar = 0;
		
		if(cualquiera.getContenidoV2() < capacidadPasar) {
			cuantoPasar = cualquiera.getContenidoV2(); 
		} else {
			cuantoPasar = capacidadPasar;
		}
		
		cualquiera.setContenidoV2(cualquiera.getContenidoV2() - cuantoPasar);		
		cualquiera.setContenidoV1(cualquiera.getContenidoV1() + cuantoPasar);
	}
}

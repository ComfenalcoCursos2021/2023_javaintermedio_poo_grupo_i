package com.grupoi.basedatos;

import java.util.ArrayList;
import java.util.List;

public class Camino {

	private List<EstadoValdes> camino;


	public Camino() {
		this.camino = new ArrayList<EstadoValdes>();
	}
	
	public void agregar(int c1, int c2) {
		EstadoValdes nuevo = new EstadoValdes(c1,c2);
		this.agregar(nuevo);		
	}
	
	public void agregar(EstadoValdes a) {
		this.camino.add(a);
	}
	public void imprimir() {
		for (EstadoValdes item : camino) {
			System.out.println(item);
		}
	}
	public EstadoValdes getUltimoEstadoValdes() {
		if(camino.size() > 0) {
			return camino.get(camino.size()-1);
		}
		return null;
	}
	public Camino clon() {
		Camino nuevo = new Camino();
		
		for (EstadoValdes elemento : camino) {
			nuevo.agregar(elemento.clon());
		}
		
		
		return nuevo;
	}
	public Camino clonSinUltimo() {
		Camino nuevo = new Camino();
		
		for (EstadoValdes elemento : camino) {
			nuevo.agregar(elemento.clon());
		}
		nuevo.camino.remove(nuevo.camino.size()-1);
		
		return nuevo;
	}
}

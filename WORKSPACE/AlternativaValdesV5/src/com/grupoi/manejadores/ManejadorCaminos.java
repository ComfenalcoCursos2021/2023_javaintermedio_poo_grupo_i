package com.grupoi.manejadores;

import java.util.ArrayList;
import java.util.List;

import com.grupoi.basedatos.Camino;
import com.grupoi.basedatos.EstadoValdes;

public class ManejadorCaminos {

	private List<Camino> caminos;
	
	public ManejadorCaminos() {
		this.caminos = new ArrayList<Camino>();
	}

	public void addCamino(Camino nuevo) {
		this.caminos.add(nuevo);
	}
	
	public void addToCamino(int c1, int c2, EstadoValdes a) {
		Camino nuevo = new Camino(c1,c2);
		nuevo.agregarCamino(a);
		this.caminos.add(nuevo);		
	}
	
	
	public List<Camino> getCurrentCaminos() {
		List<Camino> current = new ArrayList<Camino>();
		for (Camino camino : caminos) {
			current.add(camino);
		}
		return current;
	}
}

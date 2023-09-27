package com.grupoi.manejadores;

import java.util.ArrayList;

import com.grupoi.basedatos.Camino;
import com.grupoi.basedatos.EstadoValdes;

public class ManejadorCaminos {
	
	private ArrayList<Camino> caminos;
	
	public ManejadorCaminos() {
		this.caminos = new ArrayList<Camino>();
	}
	public void crearCamino(int c1, int c2) {
		EstadoValdes nuevoValde = new EstadoValdes(c1,c2);
		this.crearCamino(nuevoValde);
	}
	public void crearCamino(EstadoValdes a) {
		Camino nuevo = new Camino();
		nuevo.agregar(a);
		this.caminos.add(nuevo);
	}
	public void agregarCamino(Camino a) {
		this.caminos.add(a);
	}
	public ArrayList<Camino> getCaminos(){
		return this.caminos;
	}
	public ArrayList<Camino> getCaminosActuales(){
		return (ArrayList<Camino>) this.caminos.clone();
	}
	
}

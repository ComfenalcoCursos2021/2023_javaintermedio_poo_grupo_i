package com.grupoi.basedatos;

import java.util.ArrayList;
import java.util.List;

import com.grupoi.manejadores.ManejadorPantalla;

public class Camino {

	private List<EstadoValdes> camino;
	private int capacidadV1;
	private int capacidadV2;
	
	public Camino(int c1,int c2) {
		this.camino = new ArrayList<EstadoValdes>();
		this.capacidadV1 = c1;
		this.capacidadV2 = c2;
	}
	public Camino clonarCaminoWOL() {
		List<EstadoValdes> nuevo = new ArrayList<EstadoValdes>();
		for (EstadoValdes estadoValdes : camino) {
			nuevo.add(estadoValdes.clon());
		}
		nuevo.remove(nuevo.size()-1);
		Camino nuevoCamino = new Camino(this.capacidadV1,this.capacidadV2);
		nuevoCamino.camino = nuevo;
		return nuevoCamino;
	}
	public void agregarCamino(EstadoValdes nuevo) {
		this.camino.add(nuevo);
	}

	public EstadoValdes getLast() {
		return this.camino.size() == 0 ? null : this.camino.get(this.camino.size() - 1);
	}
	public void print() {
		System.out.println("===================="+camino.size()+"===================");
		for (EstadoValdes estadoValdes : camino) {
			System.out.println(estadoValdes);
		}
		System.out.println("===================="+camino.size()+"===================");
	}
	public void printAnimation(long time) {
		ManejadorPantalla mng = new ManejadorPantalla();
		String remoto = "";
		for (EstadoValdes item : camino) {
			mng.limpiador();
			mng.printTest(capacidadV1, capacidadV2, item);
			remoto = remoto + item.toString();
			System.out.println(remoto);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(time*4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}

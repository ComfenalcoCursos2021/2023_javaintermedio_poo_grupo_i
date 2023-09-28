package com.grupoi.manejadores;

import java.util.List;
import java.util.Vector;

import com.grupoi.basedatos.BaseDatosValdes;
import com.grupoi.basedatos.Camino;
import com.grupoi.basedatos.EstadoValdes;

public class ManejadorSolucion {

	private List<Camino> soluciones;
	private ManejadorCaminos mngCamino;
	private ManejadorValdes mngValdes;
	private BaseDatosValdes BD;

	public List<Camino> solucionar(int capacidadV1, int capacidadV2, int meta) {
		
		if(capacidadV1 < capacidadV2) {
			int temp = capacidadV1;
			capacidadV1 = capacidadV2;
			capacidadV2 = temp;
		}
		
		
		mngCamino = new ManejadorCaminos();
		mngValdes = new ManejadorValdes(capacidadV1, capacidadV2);
		BD = new BaseDatosValdes();
		BD.agregar(0, 0);
		
		
		mngCamino.addToCamino(capacidadV1,capacidadV2,new EstadoValdes(0, 0));
		EstadoValdes b1= mngValdes.llenarV1SinTocar(new EstadoValdes(0, 0));
		mngCamino.getCurrentCaminos().get(0).agregarCamino(b1);
		BD.agregar(b1);
		
		
		mngCamino.addToCamino(capacidadV1,capacidadV2,new EstadoValdes(0, 0));		
		EstadoValdes b2 = mngValdes.llenarV2SinTocar(new EstadoValdes(0, 0));
		mngCamino.getCurrentCaminos().get(1).agregarCamino(b2);
		BD.agregar(b2);
		
		boolean isMeta = false;
		int movimientos = 0;
		while (!isMeta) {
			
			for (Camino camino : mngCamino.getCurrentCaminos()) {
				EstadoValdes item = camino.getLast();
				if (evaluarMeta(item, meta)) {
					continue;
				}
				movimientos = 0;
				EstadoValdes a = mngValdes.llenarV2SinTocar(item);
				movimientos = movimientos + this.procesarEstadoValde(camino, a, movimientos);
				
				EstadoValdes b = mngValdes.llenarV1SinTocar(item);
				movimientos = movimientos + this.procesarEstadoValde(camino, b, movimientos);
				
				EstadoValdes c = mngValdes.vaciarV1SinTocar(item);
				movimientos = movimientos + this.procesarEstadoValde(camino, c, movimientos);
				
				EstadoValdes d = mngValdes.vaciarV2SinTocar(item);
				movimientos = movimientos + this.procesarEstadoValde(camino, d, movimientos);
				
				EstadoValdes e = mngValdes.pasarV1aV2SinTocar(item);
				movimientos = movimientos + this.procesarEstadoValde(camino, e, movimientos);
				
				EstadoValdes f = mngValdes.pasarV2aV1SinTocar(item);
				movimientos = movimientos + this.procesarEstadoValde(camino, f, movimientos);
			}
			
			if(movimientos == 0) {
				isMeta = true;
			}

		}
		soluciones = new Vector<Camino>();
		for (Camino camino : mngCamino.getCurrentCaminos()) {
			if(this.evaluarMeta(camino.getLast(), meta)) {
				soluciones.add(camino);
			}
		}

		return soluciones;
	}
	private int procesarEstadoValde(Camino camino, EstadoValdes a, int movimientos ) {
		if(!BD.esta(a)) {
			BD.agregar(a);
			if(movimientos >= 1) {
				Camino clon = camino.clonarCaminoWOL();
				clon.agregarCamino(a);
				mngCamino.addCamino(clon);
			} else {
				camino.agregarCamino(a);	
			}
			
			return 1;
		}
		
		return 0;
	}
	private boolean evaluarMeta(EstadoValdes a, int meta) {
		return a.getContenidoV1() == meta || a.getContenidoV2() == meta;
	}
}

package com.grupoi.manejadores;

import com.grupoi.basedatos.BaseDatosValdes;
import com.grupoi.basedatos.Camino;
import com.grupoi.basedatos.EstadoValdes;

public class SolucionadorValdes {

	private ManejadorCaminos mngCaminos;
	private BaseDatosValdes baseDatos;
	private ManejadorValdes mngValdes;

	public SolucionadorValdes() {
		this.mngCaminos = new ManejadorCaminos();
		this.baseDatos = new BaseDatosValdes();
		this.mngValdes = new ManejadorValdes();
	}

	public void solucionar(int capacidad1, int capacidad2, int meta) {

		this.mngCaminos.crearCamino(0, 0);
		this.baseDatos.agregar(0, 0);
		this.mngValdes.setCapacidadV1(capacidad1);
		this.mngValdes.setCapacidadV2(capacidad2);
		boolean continuar =true;
		while (continuar) {
			int movimientos = 0;
			for (Camino elemento : this.mngCaminos.getCaminosActuales()) {
				EstadoValdes ultimo = elemento.getUltimoEstadoValdes();
				if(ultimo.isMeta(meta)) {
					continue;
				}
				boolean agreado = false;
				EstadoValdes a = mngValdes.llenarV1SinTocar(ultimo);
				if (!this.baseDatos.esta(a)) {
					this.baseDatos.agregar(a);
					elemento.agregar(a);
					agreado = true;
					movimientos++;
				}

				EstadoValdes b = mngValdes.llenarV2SinTocar(ultimo);
				if (!this.baseDatos.esta(b)) {
					this.baseDatos.agregar(b);

					if (!agreado) {
						elemento.agregar(b);
						agreado = true;
					} else {
						Camino nuevo = elemento.clonSinUltimo();
						nuevo.agregar(b);
						mngCaminos.agregarCamino(nuevo);
					}
					movimientos++;
				}
				
				
				b = mngValdes.VaciarV1Sintocar(ultimo);
				if (!this.baseDatos.esta(b)) {
					this.baseDatos.agregar(b);

					if (!agreado) {
						elemento.agregar(b);
						agreado = true;
					} else {
						Camino nuevo = elemento.clonSinUltimo();
						nuevo.agregar(b);
						mngCaminos.agregarCamino(nuevo);
					}
					movimientos++;
				}
				
				b = mngValdes.VaciarV2Sintocar(ultimo);
				if (!this.baseDatos.esta(b)) {
					this.baseDatos.agregar(b);

					if (!agreado) {
						elemento.agregar(b);
						agreado = true;
					} else {
						Camino nuevo = elemento.clonSinUltimo();
						nuevo.agregar(b);
						mngCaminos.agregarCamino(nuevo);
					}
					movimientos++;
				}
				

				b = mngValdes.pasarV1aV2SinTocar(ultimo);
				if (!this.baseDatos.esta(b)) {
					this.baseDatos.agregar(b);

					if (!agreado) {
						elemento.agregar(b);
						agreado = true;
					} else {
						Camino nuevo = elemento.clonSinUltimo();
						nuevo.agregar(b);
						mngCaminos.agregarCamino(nuevo);
					}
					movimientos++;
				}
				b = mngValdes.pasarV2aV1SinTocar(ultimo);
				if (!this.baseDatos.esta(b)) {
					this.baseDatos.agregar(b);

					if (!agreado) {
						elemento.agregar(b);
						agreado = true;
					} else {
						Camino nuevo = elemento.clonSinUltimo();
						nuevo.agregar(b);
						mngCaminos.agregarCamino(nuevo);
					}
					movimientos++;
				}

			}
			if(movimientos==0) {
				continuar = false;
			}
		}
		for (Camino elemento : this.mngCaminos.getCaminosActuales()) {
			
			if(elemento.getUltimoEstadoValdes().isMeta(meta)) {
				System.out.println("---------------------");
				elemento.imprimir();
				System.out.println("---------------------");
			}
			
		}
		
		System.out.println("TERMINO DE SOLUCIONAR");

	}
}

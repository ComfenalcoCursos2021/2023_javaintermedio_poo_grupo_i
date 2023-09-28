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

		boolean continuar = true;
		while (continuar) {

			int hizoAlgo = 0;
			for (Camino caminoActual : this.mngCaminos.getCaminosActuales()) {
				boolean agregueYa = false;
				EstadoValdes ultimo = caminoActual.getUltimoEstadoValdes();

				if(ultimo.isMeta(meta)) {
					continue;
				}
				
				EstadoValdes a = mngValdes.llenarV1SinTocar(ultimo);
				if (!this.baseDatos.esta(a)) {
					hizoAlgo = hizoAlgo + 1;
					this.baseDatos.agregar(a);
					caminoActual.agregar(a);
					agregueYa = true;
				}

				EstadoValdes b = mngValdes.llenarV2SinTocar(ultimo);
				if (!this.baseDatos.esta(b)) {
					hizoAlgo = hizoAlgo + 1;
					this.baseDatos.agregar(b);

					if (agregueYa) {
						Camino nuevo = caminoActual.clonSinUltimo();
						nuevo.agregar(b);
						mngCaminos.agregarCamino(nuevo);
					} else {
						caminoActual.agregar(b);
						agregueYa = true;
					}
				}

				EstadoValdes c = mngValdes.VaciarV1Sintocar(ultimo);
				if (!this.baseDatos.esta(c)) {
					hizoAlgo = hizoAlgo + 1;
					this.baseDatos.agregar(c);

					if (agregueYa) {
						Camino nuevo = caminoActual.clonSinUltimo();
						nuevo.agregar(c);
						mngCaminos.agregarCamino(nuevo);
					} else {
						caminoActual.agregar(c);
						agregueYa = true;
					}
				}

				EstadoValdes d = mngValdes.VaciarV2Sintocar(ultimo);
				if (!this.baseDatos.esta(d)) {
					hizoAlgo = hizoAlgo + 1;
					this.baseDatos.agregar(d);

					if (agregueYa) {
						Camino nuevo = caminoActual.clonSinUltimo();
						nuevo.agregar(d);
						mngCaminos.agregarCamino(nuevo);
					} else {
						caminoActual.agregar(d);
						agregueYa = true;
					}
				}

				EstadoValdes e = mngValdes.pasarV1aV2SinTocar(ultimo);
				if (!this.baseDatos.esta(e)) {
					hizoAlgo = hizoAlgo + 1;
					this.baseDatos.agregar(e);

					if (agregueYa) {
						Camino nuevo = caminoActual.clonSinUltimo();
						nuevo.agregar(e);
						mngCaminos.agregarCamino(nuevo);
					} else {
						caminoActual.agregar(e);
						agregueYa = true;
					}
				}
				EstadoValdes f = mngValdes.pasarV2aV1SinTocar(ultimo);
				if (!this.baseDatos.esta(f)) {
					hizoAlgo = hizoAlgo + 1;
					this.baseDatos.agregar(f);

					if (agregueYa) {
						Camino nuevo = caminoActual.clonSinUltimo();
						nuevo.agregar(f);
						mngCaminos.agregarCamino(nuevo);
					} else {
						caminoActual.agregar(f);
						agregueYa = true;
					}
				}

			}

			if (hizoAlgo == 0) {
				continuar = false;
			}
		}

		for (Camino posibleSolucion : mngCaminos.getCaminos()) {
			if (posibleSolucion.getUltimoEstadoValdes().isMeta(meta)) {
				System.out.println("------------------------------");
				posibleSolucion.imprimir();
				System.out.println("------------------------------");
			}
		}

	}
}

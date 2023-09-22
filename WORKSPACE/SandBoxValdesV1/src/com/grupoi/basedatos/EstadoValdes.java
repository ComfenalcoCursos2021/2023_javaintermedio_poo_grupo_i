package com.grupoi.basedatos;

public class EstadoValdes {

	private int contenidoV1;
	private int contenidoV2;

	public EstadoValdes() {

	}

	public EstadoValdes(int a, int b) {
		this.contenidoV1 = a;
		this.contenidoV2 = b;
	}

	public int getContenidoV1() {
		return contenidoV1;
	}

	public void setContenidoV1(int contenidoV1) {
		this.contenidoV1 = contenidoV1;
	}

	public int getContenidoV2() {
		return contenidoV2;
	}

	public void setContenidoV2(int contenidoV2) {
		this.contenidoV2 = contenidoV2;
	}

	@Override
	public String toString() {
		return "[" + this.contenidoV1 + "," + this.contenidoV2 + "]";
	}

	public boolean equals(EstadoValdes otro) {
		if (this.contenidoV1 == otro.contenidoV1 && this.contenidoV2 == otro.contenidoV2) {
			return true;
		} else {
			return false;
		}
	}

}

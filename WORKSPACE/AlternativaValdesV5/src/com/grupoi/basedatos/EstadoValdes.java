package com.grupoi.basedatos;

public class EstadoValdes implements Cloneable{

	private int contenidoV1;
	private int contenidoV2;

	public EstadoValdes() {

	}
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Llama al método clone() de la clase Object
    }

	public EstadoValdes(int a, int b) {
		this.contenidoV1 = a;
		this.contenidoV2 = b;
	}
	public EstadoValdes clon() {
		return new EstadoValdes(this.contenidoV1,this.contenidoV2);
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

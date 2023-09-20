package com.grupoi.bombillos;

public class BombilloSmartConSensor extends BombilloSmart {

	private boolean sensorActivado;

	
	public BombilloSmartConSensor() {
		System.out.println("Constructor del smart con sensor");
		this.sensorActivado = true;	
		this.color = "RojoBrillante";
	}
	
	public boolean isSensorActivado() {
		return sensorActivado;
	}

	public void setSensorActivado(boolean sensorActivado) {
		this.sensorActivado = sensorActivado;
	}
	
	public String toString() {
		return "DESDE SMART CON SENSOR";
	}
	public void encender() {
		System.out.println("IMPRIMIENDO CON SENSOR");
		this.encendido = true;
	}
	
}

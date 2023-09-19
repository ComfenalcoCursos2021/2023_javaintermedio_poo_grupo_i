package com.grupoi.bombillos;

public class BombilloSmartConSensor extends BombilloSmart {

	private boolean sensorActivado;

	public boolean isSensorActivado() {
		return sensorActivado;
	}

	public void setSensorActivado(boolean sensorActivado) {
		this.sensorActivado = sensorActivado;
	}
	
	public String toString() {
		return "DESDE SMART CON SENSOR";
	}
}

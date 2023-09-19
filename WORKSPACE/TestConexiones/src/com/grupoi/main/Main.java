package com.grupoi.main;

import com.grupoi.conexiones.ConexionGeneral;
import com.grupoi.manejadores.ConexionesManejador;

public class Main {

	public static void main(String[] args) {

		ConexionesManejador manejador = new ConexionesManejador();
		ConexionGeneral con = manejador.getConexion(2);
		con.conectar();

	}

}

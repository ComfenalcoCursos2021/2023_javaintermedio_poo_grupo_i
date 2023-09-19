package com.grupoi.main;

import com.grupoi.conexiones.IConexionGeneral;
import com.grupoi.manejadores.ConexionesManejador;

public class Main {

	public static void main(String[] args) {

		ConexionesManejador manejador = new ConexionesManejador();
		IConexionGeneral con = manejador.getConexion(2);
		con.conectar();

	}

}

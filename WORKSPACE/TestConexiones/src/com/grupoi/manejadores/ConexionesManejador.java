package com.grupoi.manejadores;

import com.grupoi.conexiones.ConexionGeneral;
import com.grupoi.conexiones.ConexionMySQL;
import com.grupoi.conexiones.ConexionSQLServer;

public class ConexionesManejador {

	public ConexionGeneral getConexion(int numero) {
		
		if(numero == 1) {
			ConexionMySQL mysql= new ConexionMySQL();
			return mysql;
		} 
		
		if(numero == 2) {
			ConexionSQLServer sql = new ConexionSQLServer();
			return sql;
		}
		
		ConexionGeneral con = new ConexionGeneral();
		return con;
	}
}

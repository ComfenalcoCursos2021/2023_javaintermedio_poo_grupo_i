package com.grupoi.manejadores;

import com.grupoi.conexiones.ConexionMySQL;
import com.grupoi.conexiones.ConexionSQLServer;
import com.grupoi.conexiones.IConexionGeneral;

public class ConexionesManejador {

	public IConexionGeneral getConexion(int numero) {
		
		if(numero == 1) {
			ConexionMySQL mysql= new ConexionMySQL();
			return mysql;
		} 
		
		if(numero == 2) {
			ConexionSQLServer sql = new ConexionSQLServer();
			return sql;
		}
		
		return null;
	}
}

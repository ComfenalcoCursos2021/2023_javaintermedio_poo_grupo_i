package com.grupoi.conexiones;

import java.util.Scanner;

public class ConexionSQLServer implements IConexionGeneral {
	
	public void conectar() {
		System.out.println("CONECTAR AL MODO SQL SERVER");
		Scanner in  = new Scanner(System.in);
		String user = in.nextLine();
		String password = in.nextLine();
	}
	
}

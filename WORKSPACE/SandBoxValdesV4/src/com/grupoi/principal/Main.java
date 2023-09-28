package com.grupoi.principal;

import java.util.Scanner;

import com.grupoi.basedatos.Camino;
import com.grupoi.basedatos.EstadoValdes;
import com.grupoi.manejadores.ManejadorCaminos;
import com.grupoi.manejadores.ManejadorValdes;
import com.grupoi.manejadores.SolucionadorValdes;

public class Main {

	public static void main(String[] args) {

		SolucionadorValdes b = new SolucionadorValdes();
		int capacidad1 = 0;
		int capacidad2=0;
		int meta = 0;
		if(args.length > 0 ) {
			capacidad1 = Integer.parseInt(args[0]);
			capacidad2 = Integer.parseInt(args[1]);
			meta = Integer.parseInt(args[2]);
		} else 
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Ingrese la capacidad del primer valde");
			capacidad1 = in.nextInt();
			System.out.println("Ingrese la capacidad del segundo valde");
			capacidad2 = in.nextInt();
			System.out.println("Ingrese el valor de la meta");
			meta = in.nextInt();
			while(meta > capacidad1 && meta > capacidad2) {
				System.out.println("Agrege una meta que sea menor al valde de mayor capacidad");
				meta = in.nextInt();
			}
		}
		
		
		b.solucionar(capacidad1, capacidad2, meta);
		System.out.println("Termino!!!");

	}
	

}

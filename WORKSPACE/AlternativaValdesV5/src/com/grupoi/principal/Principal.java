package com.grupoi.principal;

import java.util.List;

import com.grupoi.basedatos.Camino;
import com.grupoi.basedatos.EstadoValdes;
import com.grupoi.manejadores.ManejadorSolucion;

public class Principal {

	public static void main(String[] args) throws CloneNotSupportedException {
		ManejadorSolucion mngSol = new ManejadorSolucion();
		
		int c1 = 5;
		int c2 = 3;
		int meta = 4;
		int time = 500;
		if(args.length > 0){
			c1 = Integer.parseInt(args[0]);
		}
		if(args.length > 1){
			c2 = Integer.parseInt(args[1]);
		}
		if(args.length > 2){
			meta = Integer.parseInt(args[2]);
		}
		if(args.length > 3){
			time = Integer.parseInt(args[3]);
		}
		//List<Camino> caminos = mngSol.solucionar(97, 11, 90);
		List<Camino> caminos = mngSol.solucionar(c1, c2, meta);
		for (Camino camino : caminos) {
			System.out.println("--------------------------------");
			camino.printAnimation(time);
			System.out.println("--------------------------------");
		}
		System.out.println("TERMINO!!!");
	}
	
	

}

package com.grupoi.manejadores;

import java.io.IOException;

import com.grupoi.basedatos.Camino;
import com.grupoi.basedatos.EstadoValdes;

public class ManejadorPantalla {

	public void printTest(int capacidad1, int capacidad2, EstadoValdes estado) {
		
		int marco = 10;
		int v1 = capacidad1;
		int v2 = capacidad2;
		
		int h1 = marco;
		int h2 = (int)((marco*v2*1.0)/(v1*1.0));
		
		int f1 = estado.getContenidoV1();
		int f2 = estado.getContenidoV2();
		
		int hf1 = (int)(((h1) * f1*1.0)/(v1*1.0));
		
		int hf2 = (int)(((h2) * f2*1.0)/(v2*1.0));
		
		for (int i = 0; i < marco; i++) {
			if((marco-i) == h1) {
				System.out.print("╔══════╗");
			}
			
			if((marco-i) < h1) {
				if((marco-i)< hf1) {
					System.out.print("║~~~~~~║");
				} else {
					System.out.print("║      ║");
				}
				
			}
			
			if((marco-i) == h2) {
				System.out.print(" ");
				System.out.print("╔══════╗");
			}
			if((marco-i) < h2) {
				System.out.print(" ");
				
				if((marco-i)< hf2) {
					System.out.print("║~~~~~~║");
				} else {
					System.out.print("║      ║");
				}
				
			}
			System.out.println("");
		}
		System.out.println("╚══════╝ ╚══════╝");
		
		
	}
	
	
	
	public void limpiador() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

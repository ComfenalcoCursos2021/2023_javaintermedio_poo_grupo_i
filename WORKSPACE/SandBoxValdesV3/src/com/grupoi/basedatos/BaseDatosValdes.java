package com.grupoi.basedatos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseDatosValdes {

	private List<EstadoValdes> estados;

	public BaseDatosValdes() {
		this.estados = new ArrayList<EstadoValdes>();
	}

	public void agregar(EstadoValdes nuevo) {
		this.estados.add(nuevo);
	}

	public void agregar(int c1, int c2) {
		EstadoValdes otraCosa = new EstadoValdes(c1, c2);
		this.agregar(otraCosa);
	}
	public boolean esta(int cont1,int cont2) {
		EstadoValdes paraBuscar = new EstadoValdes(cont1,cont2);
		return this.esta(paraBuscar);
	}
	public boolean esta(EstadoValdes buscado) {
		/*  ////OPCION 1
		for (int i = 0; i < this.estados.size(); i = i + 1) {
			/// el objeto en la posicion i
			EstadoValdes temporal = this.estados.get(i);
			if (temporal.equals(buscado)) {
				return true;
			}
		}
		return false;
		*/
		/*///OPCION 2
		for (EstadoValdes temporal : estados) {
			if (temporal.equals(buscado)) {
				return true;
			}
		}
		return false;
		*/
		EstadoValdes temporal = this.estados.stream()
				.filter(item -> item.equals(buscado))
				.findFirst()
				.orElse(null);
		
		if(temporal != null) {
			return true;
		} else {
			return false;
		}
		//return temporal != null;
		
	}

}

package controller;

import ag.AGenetico;
import ag.Datos;

public class Controller {
	
	private String funcActiva;
	private Datos data;
	private AGenetico algoritmo;
	private boolean dataFlag;
	
	
	/* CONSTRUCTORA */
	public Controller() {
		this.algoritmo = new AGenetico();
		this.dataFlag = false;
	}

	
	/* METODOS PUBLICOS */
	public boolean hayDatos() {
		return this.dataFlag;
	}
	
	
	public void ejecuta() {
		this.algoritmo.setData(this.data);
		this.algoritmo.ejecutaAlgoritmo();
	}

	public Datos getData() {
		return data;
	}


	public void setData(Datos data) {
		this.data = data;
	}
}

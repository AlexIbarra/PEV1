package controller;

import ag.Datos;

public class Controller {
	
	private String funcActiva;
	private Datos data;
	private boolean dataFlag;
	
	
	/* CONSTRUCTORA */
	public Controller(Datos dat) {
		this.data = dat;
		this.dataFlag = false;
	}

	
	/* METODOS PUBLICOS */
	public boolean hayDatos() {
		return this.dataFlag;
	}
}

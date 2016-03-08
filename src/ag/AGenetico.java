package ag;

public class AGenetico {
	
	private Cromosoma poblacion[];
	private Cromosoma mejorIndividuo;
	private int pos_mejorInd;
	private double prob_cruce;
	private double prob_mutacion;
	private double toleracia;
	private Datos data;
	
	
	/* CONSTRUCTORA */
	public AGenetico() {
//		this.data = dat;;
	}



	/* METODOS PUBLICOS */
	public void inicializa() {
		
		String func = data.getFuncion();
		
		if(func.equals("Funcion 1")) {
			this.poblacion = new CromosomaF1[data.getPoblacion()];
		} else if(func.equals("Funcion 2")) {
			this.poblacion = new CromosomaF2[data.getPoblacion()];
		} else if(func.equals("Funcion 3")) {
			this.poblacion = new CromosomaF3[data.getPoblacion()];
		} else if(func.equals("Funcion 4")) {
			this.poblacion = new CromosomaF4[data.getPoblacion()];
		} else {
			this.poblacion = new CromosomaF5[data.getPoblacion()];
		}
		
		for(int i=0; i<data.getPoblacion(); i++) {
			
			if(func.equals("Funcion 1")) {
				this.poblacion[i] = new CromosomaF1();
			} else if(func.equals("Funcion 2")) {
				this.poblacion[i] = new CromosomaF2();
			} else if(func.equals("Funcion 3")) {
				this.poblacion[i] = new CromosomaF3();
			} else if(func.equals("Funcion 4")) {
				this.poblacion[i] = new CromosomaF4();
			} else {
				this.poblacion[i] = new CromosomaF5();
			}
			
			this.poblacion[i].inicializaCromosoma(data);
			this.poblacion[i].inicializaAptitud(this.poblacion[i].evalua());
		}
	}
	
	public void evaluarPoblacion() {
		
	}
	
	public void incGeneracion() {
		
	}
	
	public void seleccion() {
		
	}
	
	public void reproduccion() {
		
	}
	
	public void mutacion() {
		
	}

	public boolean terminado() {
		data.setIteraciones(data.getIteraciones()-1);
		return (data.getIteraciones() > 0);
	}
	
	public Cromosoma elMejor() {
		return this.mejorIndividuo;
	}
	
	public void ejecutaAlgoritmo() {
		
		inicializa();
		evaluarPoblacion();
		 
		while(!terminado()) {
		 
			incGeneracion();
			seleccion();
			reproduccion();
			mutacion();
			evaluarPoblacion();
		}
		  
		this.mejorIndividuo = elMejor();
	}



	public void setData(Datos data) {
		this.data = data;
	}

}

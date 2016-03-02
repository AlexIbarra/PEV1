package ag;

public class AGenetico {
	
	private Cromosoma[] poblacion;
	private int tam_poblacion;
	private int max_generaciones;
	private Cromosoma mejorIndividuo;
	private int pos_mejorInd;
	private double prob_cruce;
	private double prob_mutacion;
	private double toleracia;
	private Datos data;
	
	
	/* CONSTRUCTORA */
	public AGenetico(Datos dat) {
		this.data = dat;
	}
	
	
	
	/* METODOS PUBLICOS */
	public void inicializa() {
		
		String func = data.getFuncion();
		
		for(int i=0; i<this.tam_poblacion; i++) {
			
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
			
			this.poblacion[i].inicializaCromosoma();
			this.poblacion[i].inicializaAptitud();
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
		return false;
	}
	
	public Cromosoma elMejor() {
		return this.mejorIndividuo;
	}

}

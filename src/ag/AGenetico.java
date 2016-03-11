package ag;

public class AGenetico {
	
	private Cromosoma poblacion[];
	private Cromosoma mejorIndividuo;
	private int pos_mejorInd;
	private double sumaptitud;
	private double aptitudmejor;
	private double puntuacion;
	private double punt_acumulada;
	private boolean maximizar;
	private Datos data;
	
	
	/* CONSTRUCTORA */
	public AGenetico() {

	}
	
	
	/* METODOS PRIVADOS */
	private double generaAlea() {

		return  Math.random()*1;
	}
	
	private int generaPuntoCruce() {
		return (int) Math.random()*data.getPoblacion();
	}
	
	/* Tipo de cruce MONOPUNTO */
	private void cruce(Cromosoma padre1, Cromosoma padre2, Cromosoma hijo1, Cromosoma hijo2, int punto_cruce) {
		
		// Primera parte del intercambio
		for (int i = 0; i < punto_cruce; i++) {
			hijo1.getGenes()[i] = padre1.getGenes()[i];
			hijo2.getGenes()[i] = padre2.getGenes()[i];
		}
		
		// Segunda parte del intercambio
		for (int i = punto_cruce; i < padre1.getNumGenes(); i++) {
			hijo1.getGenes()[i] = padre2.getGenes()[i];
			hijo2.getGenes()[i] = padre1.getGenes()[i];
		}
		
		// Se asignan las nuevas aptitudes
		hijo1.inicializaAptitud(hijo1.evalua());
		hijo2.inicializaAptitud(hijo2.evalua());
	}
	
	
	/* METODOS PUBLICOS */
 	public void inicializa() {
		
		String func = data.getFuncion();
		
		this.poblacion = data.inicializaPob();
		
		for(int i=0; i < data.getPoblacion(); i++) {
			
			this.poblacion[i] = data.inicializaIndiv();
			
			this.poblacion[i].inicializaCromosoma(data);
			for (int j = 0; j < poblacion[i].getNumGenes(); j++) {
				this.poblacion[i].inicializaAptitud(this.poblacion[i].evalua());
			}
			
		}
		// Dependiendo del tipo de individuo (funcion), indico si hay
		// que maximizar o minimizar la funcion
		this.maximizar = this.poblacion[0].maximiza();
		
		// Inicializo el mejor individuo al primero de la poblacion
		this.mejorIndividuo = this.poblacion[0];
	}

 	
	public void evaluarPoblacion() {
		
		/* Recorro toda la poblacion (Cromosomas) buscando el que tenga
		 * mejor aptitud (fitnnes) y marcandolo como el mejor individuo.
		 * Calculo tambien la suma de todas la aptitudes */
		for (int i = 0; i < data.getPoblacion(); i++) {
			this.sumaptitud += this.poblacion[i].getAptitud();
			if(this.poblacion[i].getAptitud() > this.aptitudmejor) {
				this.pos_mejorInd = i;
				this.aptitudmejor = this.poblacion[i].getAptitud();
			}
		}
		
		/* Recorro toda la poblacion asignando una puntuacion a cada individuo
		 * segun sus aptitudes */
		for (int i = 0; i < data.getPoblacion(); i++) {
			this.puntuacion = this.poblacion[i].getAptitud() / this.sumaptitud;
			this.poblacion[i].setPuntuacion(this.puntuacion);
			this.punt_acumulada += this.puntuacion; 
		}
		
		/* Recorro la poblacion asignando la puntuacion acumulada a cada individuo */
		for (int j = 0; j < data.getPoblacion(); j++) {
			this.poblacion[j].setPunt_acumulada(this.punt_acumulada);
		}
		
		
		/* Minimizamos la funcion */
		if(!maximizar) {
			double aux;
			this.sumaptitud = 0;
			for (int i = 0; i < data.getPoblacion(); i++) {
				aux = this.aptitudmejor - this.poblacion[i].getAptitud();
				this.poblacion[i].inicializaAptitud(aux);
				this.sumaptitud += aux;
			}
			
			for (int i = 0; i < data.getPoblacion(); i++) {
				if(this.poblacion[i].getAptitud() > this.aptitudmejor) {
					this.aptitudmejor = this.poblacion[i].getAptitud();
					this.pos_mejorInd = i;
				}
				
			}
			
			this.punt_acumulada = 0;
			for (int i = 0; i < data.getPoblacion(); i++) {
				this.poblacion[i].setPuntuacion(this.poblacion[i].getAptitud() / this.sumaptitud);
				this.poblacion[i].setPunt_acumulada(this.poblacion[i].getPuntuacion() + this.punt_acumulada);
				this.punt_acumulada += this.poblacion[i].getPuntuacion(); 
			}
			
			if(this.aptitudmejor > this.mejorIndividuo.getAptitud())
				copiaMejor(this.poblacion[this.pos_mejorInd]);
		}
		
		
	}

	
	public void incGeneracion() {
		
	}
	
	/* Aplicamos el metodo de seleccion de la RULETA */
	public void seleccion() {
		// Guarda las posiciones de los individuos supervivientes
		int supervivientes[] = new int[data.getPoblacion()];
		int pos_superviviente;
		// Guarda la probabilidad que tiene un individuo de ser seleccionado
		double prob_selec = 0;
		
		// Calculamos aquellos que seran seleccionados para sobrevivir
		for (int i = 0; i < data.getPoblacion(); i++) {
			prob_selec = generaAlea();
			pos_superviviente = 0;
			while((prob_selec > this.poblacion[pos_superviviente].getPuntuacion()) &&
					(pos_superviviente < data.getPoblacion())) 
				pos_superviviente++;
			
			supervivientes[i] = pos_superviviente;
		}
		
		// Se genera una poblacion intermedia
		Cromosoma pob_intermedia[] = data.inicializaPob();
		for (int i = 0; i < data.getPoblacion(); i++) {
			// Comprobar si no hay que hacer una copia en profundidad
			pob_intermedia[i] = this.poblacion[supervivientes[i]]; 
		}
		this.poblacion = pob_intermedia;		
	}
	
	
	public void reproduccion() {
		// Guarda los individuos seleccionados para la reproduccion
		int sel_rep[] = new int[data.getPoblacion()];
		// Contador de individuos seleccionados
		int cont_sel_rep = 0;
		int punto_cruce;
		double prob_sel_rep;
		Cromosoma hijo1, hijo2;
		hijo1 = data.inicializaIndiv();
		hijo2 = data.inicializaIndiv();
		
		/* Se eligen los individuos para la reproduccion (para cruzar) */
		for (int i = 0; i < data.getPoblacion(); i++) {
			prob_sel_rep = generaAlea();
			if(prob_sel_rep*100 < data.getPorcCruce()) {
				sel_rep[cont_sel_rep] = i;
				cont_sel_rep++;
			}			
		}
		
		/* Se hace que el numero de seleccionados sea par */
		if((cont_sel_rep % 2) == 1)
			cont_sel_rep--;
		
		// Generamos el punto de cruce
		punto_cruce = generaPuntoCruce();
		
		for (int i = 0; i < data.getPoblacion(); i+=2) {
			cruce(this.poblacion[sel_rep[i]], this.poblacion[sel_rep[i+1]], hijo1, hijo2, punto_cruce);
			
			// Los nuevos individuos sustituyen a sus progenitores
			this.poblacion[sel_rep[i]].setGenes(hijo1.getGenes());
			this.poblacion[sel_rep[i+1]].setGenes(hijo2.getGenes());
		}
	}
	
	
	public void mutacion() {
		
		boolean mutado;
		double prob_mutacion;
		
		for (int i = 0; i < data.getPoblacion(); i++) {
			mutado = false;
			for (int j = 0; j < poblacion[i].getNumGenes(); j++) {				
				for (int z = 0; z < poblacion[i].getGenes()[j].getLongIndividuo(); z++) {
					prob_mutacion = generaAlea();
					if(prob_mutacion*100 < data.getPorcMutacion()) {
						poblacion[i].getGenes()[j].getGen()[z] = !poblacion[i].getGenes()[j].getGen()[z];
						mutado = true;
					}
				}
			}
			
			// Recalculamos la aptitud del individuo mutado
			if(mutado) {
				this.poblacion[i].inicializaAptitud(this.poblacion[i].evalua());
			}
		}
		
	}

	public boolean terminado() {
		data.setIteraciones(data.getIteraciones()-1);
		return (data.getIteraciones() > 0);
	}
	
	public Cromosoma elMejor() {
		return this.mejorIndividuo;
	}
	
	public void copiaMejor(Cromosoma mejor) {
		this.mejorIndividuo = mejor;
	}
	
	public void ejecutaAlgoritmo() {
		
		inicializa();
		evaluarPoblacion();
		 
		while(!terminado()) {
		 
//			incGeneracion();
			seleccion();
			reproduccion();
			mutacion();
			evaluarPoblacion();
		}
		  
//		this.mejorIndividuo = elMejor();
	}



	public void setData(Datos data) {
		this.data = data;
	}

}

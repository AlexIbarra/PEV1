package ag;

public class CromosomaF1 implements Cromosoma {
	
	
	private Gen genes[];
	private int fenotipos[];
	private double aptitud;
	private double puntuacion;
	private double punt_acumulada;
	private int xmin;
	private int xmax;
	private int tamCromosoma;
	
	
	/* CONSTRUCTORA */
	public CromosomaF1() {
	
		this.xmin = -250;
		this.xmax = 250;
		this.tamCromosoma = 1;
		this.genes = new Gen[1];
		this.fenotipos = new int[1];
	}
	
	
	/* METODOS PUBLICOS */

	@Override
	public double evalua() {

		return -(Math.abs(this.fenotipos[0]*Math.sin(Math.sqrt(Math.abs(this.fenotipos[0])))));
	}

//	@Override
//	public double fenotipo() {
//
//		return 0;
//	}
//
//
//	public double funcion() {
//
//		return -(Math.abs(this.fenotipos[0]*Math.sin(Math.sqrt(Math.abs(this.fenotipos[0])))));
//	}

	@Override
	public void inicializaCromosoma(Datos data) {

		for (int i = 0; i < this.tamCromosoma; i++) {
			this.genes[i] = new Gen();
			this.genes[i].calculaLongitud(this.xmin, this.xmax, data.getPrecision());
			this.genes[i].inicializaGen();			
			this.genes[i].calculaFenotipo(this.xmin, this.xmax);
		}
		
	}

	@Override
	public void inicializaAptitud(double apt) {
		this.aptitud = apt;		
	}


	public double getAptitud() {
		return aptitud;
	}


//	public void setAptitud(double aptitud) {
//		this.aptitud = aptitud;
//	}

}

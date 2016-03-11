package ag;

public class CromosomaF1 implements Cromosoma {
	
	
	private Gen genes[];
	private double fenotipos[];
	private double aptitud;
	private double puntuacion;
	private double punt_acumulada;
	private int xmin;
	private int xmax;
	private int numGenes;
	
	
	/* CONSTRUCTORA */
	public CromosomaF1() {
	
		this.xmin = -250;
		this.xmax = 250;
		this.numGenes = 1;
		this.genes = new Gen[1];
		this.fenotipos = new double[1];
	}
	
	
	/* METODOS PUBLICOS */

	@Override
	public double evalua() {
		
		double num = Math.abs(this.fenotipos[0]*Math.sin(Math.sqrt(Math.abs(this.fenotipos[0])))); 

		return -(num);
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

		for (int i = 0; i < this.numGenes; i++) {
			this.genes[i] = new Gen();
			this.genes[i].calculaLongitud(this.xmin, this.xmax, data.getPrecision());
			this.genes[i].inicializaGen();			
			this.fenotipos[i] = this.genes[i].calculaFenotipo(this.xmin, this.xmax);
		}
		
	}

	@Override
	public void inicializaAptitud(double apt) {
		this.aptitud = apt;		
	}


	public double getAptitud() {
		return aptitud;
	}


	public Gen[] getGenes() {
		return genes;
	}


	public void setGenes(Gen[] genes) {
		this.genes = genes;
	}


	public int getNumGenes() {
		return numGenes;
	}


	public double getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}


	public double getPunt_acumulada() {
		return punt_acumulada;
	}


	public void setPunt_acumulada(double punt_acumulada) {
		this.punt_acumulada = punt_acumulada;
	}


	@Override
	public boolean maximiza() {
		return false;
	}

}

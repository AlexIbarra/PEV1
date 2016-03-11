package ag;

public class Gen {
	
	private boolean gen[]; // Cadena de bits (genotipo)
	private double fenotipo;  // Valor del genotipo
	private int longIndividuo;
	
	
	/* CONSTRUCTORA */
	public Gen() {
		
	}
	
	
	/* METODOS PRIVADOS */
		
	private int binToDec() {
		
		int decimal = 0;
		int val;
		
		for (int i = 0; i < longIndividuo; i++) {
			val = (this.gen[i])? 1 : 0;
			decimal += val * (int) Math.pow(2, i);
		}
		
		return decimal;
	}
	
	private double generaAlea() {

		return  Math.random()*1;
	}
	
	
	
	/* METODOS PUBLICOS */
	public void calculaLongitud(int min, int max, double tol) {
		
		this.longIndividuo = (int) (((int) Math.log(1 + ((max-min)/tol) )) / Math.log(2));
		this.gen = new boolean[longIndividuo];
	}
	
	public double calculaFenotipo(int min, int max) {
		return (min + (max-min) * binToDec() / (Math.pow(2, this.longIndividuo)-1));
//		return binToDec();
	}
	
	public void inicializaGen() {
		
		for (int i = 0; i < longIndividuo; i++) {
			
			this.gen[i] = (generaAlea() >= 0.5)? true : false;
		}
	}


	public int getLongIndividuo() {
		return longIndividuo;
	}


	public boolean[] getGen() {
		return gen;
	}

}

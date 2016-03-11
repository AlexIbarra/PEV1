package ag;

public class Datos {
	
	private String funcion;
	private double precision;
	private int poblacion;
	private int iteraciones;
	private double porcCruce;
	private double porcMutacion;
	private int semilla;
	private String tipoCruce;
	private String seleccion;
	
	
	
	/* METODOS PUBLICOS */
	
	public String getFuncion() {
		return funcion;
	}
	
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	
	public double getPrecision() {
		return precision;
	}
	
	public void setPrecision(double precision) {
		this.precision = precision;
	}
	
	public int getPoblacion() {
		return poblacion;
	}
	
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	
	public int getIteraciones() {
		return iteraciones;
	}
	
	public void setIteraciones(int iteraciones) {
		this.iteraciones = iteraciones;
	}
	
	public double getPorcCruce() {
		return porcCruce;
	}
	
	public void setPorcCruce(double porcCruce) {
		this.porcCruce = porcCruce;
	}
	
	public double getPorcMutacion() {
		return porcMutacion;
	}
	
	public void setPorcMutacion(double porcMutacion) {
		this.porcMutacion = porcMutacion;
	}
	
	public int getSemilla() {
		return semilla;
	}
	
	public void setSemilla(int semilla) {
		this.semilla = semilla;
	}
	
	public String getTipoCruce() {
		return tipoCruce;
	}
	
	public void setTipoCruce(String tipoCruce) {
		this.tipoCruce = tipoCruce;
	}
	
	public String getSeleccion() {
		return seleccion;
	}
	
	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}
	
	public Cromosoma [] inicializaPob() {
		if(funcion.equals("Funcion 1")) {
			return new CromosomaF1[poblacion];
		} else if(funcion.equals("Funcion 2")) {
			return new CromosomaF2[poblacion];
		} else if(funcion.equals("Funcion 3")) {
			return new CromosomaF3[poblacion];
		} else if(funcion.equals("Funcion 4")) {
			return new CromosomaF4[poblacion];
		} else {
			return new CromosomaF5[poblacion];
		}
	}
	
	public Cromosoma inicializaIndiv() {
		if(funcion.equals("Funcion 1")) {
			return new CromosomaF1();
		} else if(funcion.equals("Funcion 2")) {
			return new CromosomaF2();
		} else if(funcion.equals("Funcion 3")) {
			return new CromosomaF3();
		} else if(funcion.equals("Funcion 4")) {
			return new CromosomaF4();
		} else {
			return new CromosomaF5();
		}
	}

}

package ag;

public class CromosomaF3 implements Cromosoma {
	
	
	
	private Gen[] genes;
	private int[] fenotipos;
	private int xmin;
	private int xmax;
	
	
	/* METODOS PUBLICOS */

	@Override
	public double evalua() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public double fenotipo() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public double funcion() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	public int getXmin() {
		return xmin;
	}

	public void setXmin(int xmin) {
		this.xmin = xmin;
	}

	public int getXmax() {
		return xmax;
	}

	public void setXmax(int xmax) {
		this.xmax = xmax;
	}

	@Override
	public void inicializaCromosoma(Datos data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inicializaAptitud(double apt) {
		// TODO Auto-generated method stub
		
	}

}

package ag;

public class CromosomaF2 implements Cromosoma {
	
	
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

	@Override
	public Gen[] getGenes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGenes(Gen[] genes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumGenes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPuntuacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPuntuacion(double puntuacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPunt_acumulada() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPunt_acumulada(double punt_acumulada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getAptitud() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean maximiza() {
		// TODO Auto-generated method stub
		return false;
	}

}

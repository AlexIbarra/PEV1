package ag;

public interface Cromosoma {
		
	public double evalua();
	public void inicializaCromosoma(Datos data);
	public void inicializaAptitud(double apt);
	public Gen[] getGenes();
	public void setGenes(Gen[] genes);
	public int getNumGenes();
	public double getPuntuacion();
	public void setPuntuacion(double puntuacion);
	public double getPunt_acumulada();
	public void setPunt_acumulada(double punt_acumulada);
	public double getAptitud();
	public boolean maximiza();

}

package ProgramacionHerencias.ParqueMovil;

public class Camion extends Vehiculo {

	private int limiteCarga;
	private int carga;
	private String conductor;

	public Camion(int año, String marca, int numRuedas, int autonomia, int limiteCarga, int carga, String conductor) {
		super(año, marca, numRuedas, autonomia);
		this.limiteCarga = limiteCarga;
		this.carga = carga;
		this.conductor = conductor;
		if(this.carga > this.limiteCarga)
			this.carga = this.limiteCarga;
	}

	public void cambiarConductor(String conductor) {

		this.conductor = conductor;

	}
	
	public void cargar(int cargaNueva) 
	{
		this.carga += cargaNueva;
		if(this.carga > this.limiteCarga)
			this.carga = this.limiteCarga;
		
	}
	public void descargar (int cargaNueva) 
	{
		
		this.carga -= cargaNueva;
		if(this.carga < 0) 
		{
			this.carga = 0;
		}
		
	}
	
	

	@Override
	public String toString() {
		super.toString();
		return "Camion [limiteCarga=" + limiteCarga + ", carga=" + carga + ", conductor=" + conductor + "]";
	}

	public int getLimiteCarga() {
		return limiteCarga;
	}

	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

}
package ProgramacionHerencias.ParqueMovil;

public class Vehiculo {
	private static int ContadorVehiculos = 0;
	private int año;
	private String marca;
	protected int numRuedas;
	private int autonomía;

	public Vehiculo(int año, String marca, int numRuedas, int autonomia) {
		this.año = año;
		this.marca = marca;
		this.numRuedas = numRuedas;
		this.autonomía = autonomia;
		
		ContadorVehiculos++;

	}

	public Vehiculo(int año, String marca, int autonomia) {
		this.año = año;
		this.marca = marca;
		this.autonomía = autonomia;
		
		ContadorVehiculos++;
	}

	@Override
	public String toString() {
		return "Vehiculo [año=" + año + ", marca=" + marca + ", numRuedas=" + numRuedas + ", autonomía=" + autonomía
				+ "]";
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAutonomía() {
		return autonomía;
	}

	public void setAutonomía(int autonomía) {
		this.autonomía = autonomía;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public static int getContadorVehiculos() {
		return ContadorVehiculos;
	}
	
	
}

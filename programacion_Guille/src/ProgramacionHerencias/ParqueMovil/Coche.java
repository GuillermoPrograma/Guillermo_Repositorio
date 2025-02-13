package ProgramacionHerencias.ParqueMovil;

public class Coche extends Vehiculo{

	private String color;
	private int numPasajeros;
	private boolean descapotable;
	
	Coche(int año, String marca, int autonomia, String color, int numPasajeros, boolean descapotable)
	{
		super(año,marca,autonomia);
		this.color = color;
		this.numPasajeros = numPasajeros;
		this.descapotable = descapotable;
		super.numRuedas = 4;
		
	}
	
	
	public void pintar (String color) 
	{
		this.color = color;
		
	}

	
	@Override
	public String toString() {
		super.toString();
		return "Coche [color=" + color + ", numPasajeros=" + numPasajeros + ", descapotable=" + descapotable + "]";
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
	
	
	
}

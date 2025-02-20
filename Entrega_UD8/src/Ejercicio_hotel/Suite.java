package Ejercicio_hotel;

public class Suite extends Habitacion {
	private int numEspacios;
	private boolean jacuzzi;
	
	public Suite(int numHabitacion, int numEspacios, boolean jacuzzi) 
	{
		super(numHabitacion);
		this.numEspacios = numEspacios;
		this.jacuzzi = jacuzzi;
	}
	public void calcularCosteTotal() 
	{
		if(jacuzzi)
		System.out.println(this.getPrecioBase()+(this.getPrecioBase()*0.35)+this.getPrecioBase()*0.1);
		else
			System.out.println(this.getPrecioBase()+(this.getPrecioBase()*0.35));
	}
	@Override
	public String toString() {
		
		return "Suite [numEspacios=" + numEspacios + ", jacuzzi=" + jacuzzi + "]" + super.toString();
	}
	
	
	
}

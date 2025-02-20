package Ejercicio_hotel;

public class Estandar extends Habitacion {

	private boolean desayuno;
	private Camas cama;
	
	public Estandar(int numHabitacion, boolean desayuno, Camas cama) 
	{
		super(numHabitacion);
		this.desayuno = desayuno;
		this.cama = cama;
	}
	
	public void calcularCosteTotal()
	{
		if(desayuno)
		System.out.println("PrecioTotal : " + this.getPrecioBase()+(this.getPrecioBase()*0.1) + 5);
		else
			System.out.println("PrecioTotal : " + this.getPrecioBase()+this.getPrecioBase()*0.1);
	}
	
	

	@Override
	public String toString() {
		
		return "estandar [desayuno=" + desayuno + ", cama=" + cama + "]" +super.toString();
	}

	public boolean isDesayuno() {
		return desayuno;
	}

	public Camas getCama() {
		return cama;
	}	
	
	
}

package ProgramacionHerencias.ParqueMovil;

public class Empresa {

	String nombre;
	int tamFlota;
	
	
	public Empresa(int tamFlota,Vehiculo[] vehiculos,String nombre ) 
	{
		this.tamFlota = tamFlota;
		Vehiculo[] Flota = new Vehiculo[tamFlota];
		this.nombre = nombre;
	}
	
	
}

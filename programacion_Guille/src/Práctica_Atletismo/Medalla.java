package Práctica_Atletismo;

public class Medalla {

	Carrera carrera;
	Tipo tipo;
	
	Medalla(Tipo tipo, Carrera carrera)
	{
		this.tipo = tipo;
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Medalla [carrera=" + carrera + ", tipo=" + tipo + "]";
	}
	
}

package ProgramacionHerencias.Universidad;

public class Asociado extends Profesor {

	int numHoras;
	
	Asociado()
	{
	super();
	numHoras = 0;
	}
	Asociado(String nombre, String apellido, int edad,String ideProfesor, String fechaAlta, int salarioBruto, double irpf, int numHoras)
	{
		super(nombre,apellido,edad,ideProfesor,fechaAlta,salarioBruto,irpf);
		this.numHoras  = numHoras;
	}
	public String altaProfesor() 
	{
		if(this.numHoras <= 0)
			return null;
		if(this.numHoras < 9)
			return " alta a media jornada";
		if(this.numHoras<12 || this.numHoras > 9)
			return " alta a dos tercios de jornada";
		else
			return "jornada completa.";
	}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	@Override
	public String toString() {
		super.toString();
		return "Asociado [numHoras=" + numHoras + "]";
	} 
	
	
}
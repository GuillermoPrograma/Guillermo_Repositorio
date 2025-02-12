package ProgramacionHerencias.Empleados;

public class Repartidores extends Empleados {
 
	private String zona;
	
	
	Repartidores(String nombre, int edad, double salario, String zona)
	{
		super(nombre,edad,salario);
		
		this.zona = zona;
	}
	
	
	public void Plus() 
	{
		
		if(super.getEdad() < 25 && this.zona.equals("zona3")) 
		{
			
			super.setSalario(this.getSalario() + this.getPLUS());
			
		}
		
		
	}
	
	
	

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		super.toString();
		return "Repartidores [zona=" + zona + "]";
	}
	
	
}

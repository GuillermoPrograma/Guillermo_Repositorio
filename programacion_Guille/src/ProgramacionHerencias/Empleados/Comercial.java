package ProgramacionHerencias.Empleados;

public class Comercial extends Empleados{

	double comision;

	Comercial(String nombre, int edad, double salario, double comision)
	{
		super(nombre,edad,salario);
		this.comision = comision;
		
	}
	
	
	@Override
	public String toString() {
		super.toString();
		return "Comercial [comision=" + comision + "]";
	}
	
	
	
	
}

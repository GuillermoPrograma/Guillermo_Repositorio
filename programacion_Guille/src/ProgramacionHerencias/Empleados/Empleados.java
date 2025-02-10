package ProgramacionHerencias.Empleados;

public abstract class Empleados {

	private String nombre;
	private int edad;
	private double salario;
	private final double PLUS = 300;
	
	Empleados(){}
	Empleados(String nombre, int edad, double salario)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", PLUS=" + PLUS + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getPLUS() {
		return PLUS;
	}
	
	
	
}

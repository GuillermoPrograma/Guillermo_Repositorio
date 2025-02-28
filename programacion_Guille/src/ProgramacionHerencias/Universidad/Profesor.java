package ProgramacionHerencias.Universidad;

import java.time.LocalDateTime;

public abstract class Profesor extends Persona {

	private String ideProfesor;
	private String fechaAlta;
	private int salarioBruto;
	private double irpf;
	private static int numProfes = 0;
	
	
	Profesor()
	{
		super();
		this.ideProfesor ="ideProfeDef";
		this.fechaAlta ="FechaAltaDef";
		this.salarioBruto = 0;
		this.irpf = 0;
		numProfes ++;
	}
	Profesor(String nombre, String apellido, int edad,String ideProfesor, String fechaAlta, int salarioBruto, double irpf)
	{
		super(nombre, apellido,edad);
		this.ideProfesor = ideProfesor;
		this.fechaAlta = fechaAlta;
		this.salarioBruto = salarioBruto;
		this.irpf = irpf;
		numProfes++;
	}
	
	
	
	public void calculaAntiguedad()
	{
		LocalDateTime hoy = LocalDateTime.now();
		String año = fechaAlta.substring(4);
		int añosCotizados;
		añosCotizados = hoy.getYear() - Integer.parseInt(año);
		
		System.out.println("ha estado " + añosCotizados + " años");
	}
	public double importeNomina() 
	{
		double nomina = this.salarioBruto - this.irpf;
		return nomina;
		
	}
	
	public abstract String altaProfesor();
	
	public String getIdeProfesor() {
		return ideProfesor;
	}
	public void setIdeProfesor(String ideProfesor) {
		this.ideProfesor = ideProfesor;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public int getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(int salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getIrpf() {
		return irpf;
	}
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}
	public static int getNumProfes() {
		return numProfes;
	}
	public static void setNumProfes(int numProfes) {
		Profesor.numProfes = numProfes;
	}
	@Override
	public String toString() {
		super.toString();
		return "Profesor [ideProfesor=" + ideProfesor + ", fechaAlta=" + fechaAlta + ", salarioBruto=" + salarioBruto
				+ ", irpf=" + irpf + "]";
	}
	
	
}

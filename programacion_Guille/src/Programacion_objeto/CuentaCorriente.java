package Programacion_objeto;

public class CuentaCorriente {

	private String dni;
	private String nombre;
	private double Saldo;
	private  String nombreBanco = "Santander";
	public CuentaCorriente(String d, double s) 
	{
		
		dni = d;
		Saldo = s;
		
	}
	public CuentaCorriente(String d, String n, double s) 
	{
		
		dni = d;
		Saldo = s;
		nombre = n;
		
	}
	
	public void sacarDinero(double dineroRetirado) 
	{
		if(Saldo - dineroRetirado >=0) 
		{
			System.out.println("Se ha podido realizar la acción");
			Saldo = Saldo - dineroRetirado;
		}else {
			
			System.out.println("Dinero insuficiente");
		}
	
	
		
	}
	public void ingresarDinero ( double dineroIngresado) 
	{
		Saldo = Saldo + dineroIngresado;
		
		
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public  String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	
	
}

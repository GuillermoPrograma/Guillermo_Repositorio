package Programacion_objeto;

public class CuentaCorriente {

	String dni;
	String nombre;
	double Saldo;
	
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
	
}

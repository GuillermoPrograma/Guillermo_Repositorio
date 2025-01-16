package Programacion_objeto_Ejercicio5_2.CuentaCorriente2;

public class Cuenta {

	private String titular;
	private double cantidad;
	
	
	public Cuenta(String titular)
	{
		this.titular = titular;
	}
	public Cuenta(String titular, double cantidad) 
	{
		this.titular = titular;
		this.cantidad = cantidad;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}	
	
	public void ingresar(int dinero)
	{
		if(dinero > 0) {
			
			this.cantidad += dinero;
		}
		
	}	
	
	public void Retirar(int dinero)
	{
		if(dinero >0) {
			
			this.cantidad -= dinero;
			if(this.cantidad < 0)
				this.cantidad = 0;
		}
		
	}	
}

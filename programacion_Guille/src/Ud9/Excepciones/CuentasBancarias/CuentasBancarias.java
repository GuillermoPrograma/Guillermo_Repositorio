package Ud9.Excepciones.CuentasBancarias;

public class CuentasBancarias {

	private String nombre;
	private double cuenta;
	public CuentasBancarias(String nombre , double cuenta)
	{
		this.nombre = nombre;
		this.cuenta = cuenta;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCuenta() {
		return cuenta;
	}
	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
}

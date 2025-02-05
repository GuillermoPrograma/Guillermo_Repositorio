package ProgramacionHerencias.Cuentas;

public class CuentaCorriente extends Titular {
	
private String numCuenta;
private double saldo;
private Titular titular;

	CuentaCorriente(Titular titular, String numCuenta , double saldo)
	{
		this.titular = titular;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}
	CuentaCorriente(Titular titular, String numCuenta)
	{
	this.titular = titular;
	this.numCuenta = numCuenta;
	this.saldo = 100;
		
	}
	
	public void Ingresar(double ingreso)
	{
		saldo += ingreso;
	}	
	public void Reintegro(double reintegro) 
	{
		saldo -= reintegro;
		if(saldo < 0)
			saldo = 0;
	}
	public void Imprimir() 
	{
		System.out.println(this.numCuenta);
		System.out.println(this.saldo);
		
	}
	public boolean CompararCuentas(CuentaCorriente cuenta2) 
	{
		boolean esIgual = false;
		if(this.numCuenta == cuenta2.getNumCuenta())
			esIgual=true;
		
		
		return esIgual;
	}
	
	
	public String getNumCuenta() {
		return numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}

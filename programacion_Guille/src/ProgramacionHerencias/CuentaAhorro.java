package ProgramacionHerencias;

public class CuentaAhorro extends CuentaCorriente {
	private double interes;
	
		CuentaAhorro(Titular titular, String numCuenta , double saldo, double interes) 
		{
			super(titular, numCuenta, saldo);
			this.interes = interes;
			
		}
		CuentaAhorro(Titular titular, String numCuenta , double interes) 
		{
			super(titular, numCuenta);
			this.interes = interes;
			
		}
		CuentaAhorro(Titular titular, String numCuenta ) 
		{
			super(titular, numCuenta);
			this.interes = 2.5;
			
		}
		public void CalcularInteres() 
		{
			
			this.setSaldo(this.getSaldo()+(this.getSaldo()*interes)/100);
		}
		
		
		public double getInteres() {
			return interes;
		}
		public void setInteres(double interes) {
			this.interes = interes;
		}
		
		
		
}

package Programacion_Estaticos.Ejercicio1;

public class CuentaCorriente {

	private String titular;
	private double saldo;

	public CuentaCorriente(String titular, int saldo) {

		this.titular = titular;
		this.saldo = saldo;
	}

	public void depositar(double cantidad) {
		if (cantidad > 0) {
			this.saldo += cantidad;
			System.out.println("Tu saldo es :" + this.saldo);
		}

		else
			System.out.println("Tienen que ser números positivos");
	}

	public void retirar(double cantidad) {
		if (this.saldo >= cantidad)
			this.saldo = this.saldo - cantidad;
		System.out.println("Tu saldo es :" + this.saldo);

	}

	public void calcularInteres() {
		double interesCalculo;
		interesCalculo = Banco.getTasaInteres() / 100;
		this.saldo += this.saldo * interesCalculo;
		System.out.println("Tu saldo tiene de interes : " + interesCalculo);
		System.out.println("Tu saldo es :" + this.saldo);
	}

	@Override
	public String toString() {
		return "CuentaCorriente [titular=" + titular + ", saldo=" + saldo + "]";
	}

}

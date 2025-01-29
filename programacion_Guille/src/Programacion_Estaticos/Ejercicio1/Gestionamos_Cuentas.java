package Programacion_Estaticos.Ejercicio1;

public class Gestionamos_Cuentas {

	public static void main(String[] args) {
		Banco caixa = new Banco();
		Banco.setTasaInteres(3);
		caixa.setNombre("caixa");
		CuentaCorriente c1 = new CuentaCorriente("Guillermo", 2000);

		c1.depositar(200);
		c1.retirar(150);
		c1.calcularInteres();

	}
}

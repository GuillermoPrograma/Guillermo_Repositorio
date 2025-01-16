package Programacion_objeto_Ejercicio5_2.CuentaCorriente2;

public class InstanciamosCuenta {

	 public static void main(String[] args) {
		Cuenta Guille = new Cuenta("Guillermo", 20);
		Cuenta Pilar = new Cuenta ("Pilar" , 9);
		Guille.ingresar(50);
		System.out.println(Guille.getCantidad());
		
		
		Guille.transferencia(Pilar, 70);
		System.out.println("Guille: " + Guille.getCantidad());
		System.out.println("Pilar: " + Pilar.getCantidad());
	}
}

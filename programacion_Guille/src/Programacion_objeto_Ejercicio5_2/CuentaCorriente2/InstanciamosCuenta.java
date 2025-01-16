package Programacion_objeto_Ejercicio5_2.CuentaCorriente2;

public class InstanciamosCuenta {

	 public static void main(String[] args) {
		Cuenta Guille = new Cuenta("Guillermo", 20);
		
		Guille.ingresar(50);
		System.out.println(Guille.getCantidad());
		
		Guille.Retirar(90);
		System.out.println(Guille.getCantidad());
		
		
	}
}

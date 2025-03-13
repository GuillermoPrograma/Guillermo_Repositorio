package Ud8.Estaticos.Ejercicio1;

public class PruebaPila extends Pila {

	public static void rellenar(ColeccionInterfaz pila) {
		for (int i = 0; i < ((Pila) pila).getPila().length; i++) {
			pila.aniadir(i);

		}

	}

	public static void imprimirYVaciar(ColeccionInterfaz pila) {
		for (int i = 0; i < ((Pila) pila).getPila().length; i++) {
			System.out.println("Imprimo y vacío: ");
			if (((Pila) pila).getPila()[i] != null)
				System.out.println(((Pila) pila).getPila()[i].toString());
			((Pila) pila).getPila()[i] = null;
		}

	}

}

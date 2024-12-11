package Ejercicio6_ArraysString;

public class Ejercicio7_ArrayPrimos {
	public static void main(String[] args) {

		int numeros[] = new int[20];
		int contador = 0;
		int indice = 0;
		boolean esprimo = true;
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (0 + Math.random() * (99 - 0 + 1));
		}

		for (int i = 0; i < numeros.length; i++) {

			if (i != numeros[i]) {
				System.out.println("Numeros : " + numeros[i]);

				for (int j = 2; j < Math.sqrt(numeros[i]) + 1; j++) {
					if (numeros[i] % j == 0) {
						esprimo = false;
					}

				}

			}

			if (esprimo == true) {
				contador++;

			}
			esprimo = true;
		}

		int numerosPrimos[] = new int[contador];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 2; j < Math.sqrt(numeros[i]) + 1; j++) {
				if (numeros[i] % j == 0) {
					esprimo = false;
				}

			}
			if (esprimo == true) {
				numerosPrimos[indice] = numeros[i];
				indice++;
			}
			esprimo = true;
		}
		for (int i = 0; i < numerosPrimos.length; i++) {
			System.out.println("Numeros Primos: " + numerosPrimos[i]);

		}

	}
}

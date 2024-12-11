package practica2;

import java.util.Scanner;

public class Ejercicio2_Rotar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeros[] = new int[15];
		int numeroFinal = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Escribe Numero" + i + ": ");
			numeros[i] = entrada.nextInt();
			

		}
		System.out.println(" ");
		numeroFinal = numeros[numeros.length - 1];
		for (int i = numeros.length - 1; i >= 0; i--) {
			if (i < numeros.length - 1) {

				numeros[i + 1] = numeros[i];
			}

		}
		numeros[0] = numeroFinal;
		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);

		}

	}

}

package Ud5.ejercicio4;

import java.util.Scanner;

public class Codigo_comprobación {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = entrada.nextInt();
		descomponer(num);
	}

	public static void descomponer(int num) {

		int contador = 0;
		int espArray = 0;
		int numPrimerBucle = num;
		while (numPrimerBucle > 0) {
			numPrimerBucle = numPrimerBucle / 10;
			espArray++;
		}

		int[] cadena = new int[espArray];
		contador = espArray - 1;
		while (num > 0) {

			cadena[contador] = num % 10;
			num = num / 10;
			contador--;

		}

		calculamos(cadena);
	}

	public static void calculamos(int[] cadena) {
		int numPar = 0;
		int numImpar = 100;
		int sumatotal = 0;
		for (int i = 0; i < cadena.length; i++) {
			if ((i + 1) % 2 == 0) {
				for (int j = 0; j < i; j++) {
					if (cadena[j] > numPar)
						numPar = cadena[j];
				}
				sumatotal += cadena[i] * 2 + numPar;
			} else {
				for (int j = i+1; j < cadena.length; j++) {
					if (cadena[j] < numImpar)
						numImpar = cadena[j];
				}
				sumatotal += (cadena[i] * 3 + numImpar);
			}
			numImpar=100;

		}
		System.out.print(sumatotal);
	}
}

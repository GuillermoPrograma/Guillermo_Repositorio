package Ejercicio6_ArraysString;

import java.util.Scanner;

public class Ejercicio_3_UltimoNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int tamañoMatriz = entrada.nextInt();
		int nCorrecto = 0;
		int matriz[] = new int[tamañoMatriz];
		int contador = 0;
		int matrizI[] = new int[tamañoMatriz];

		boolean nCorrectoBucle = true;
		int numeroElegido = 0;
		int numeroI = 0;
		for (int i = 0; i < matriz.length; i++) {

			matriz[i] = (int) (1 + Math.random() * (300 - 1 + 1));
		}

		while (nCorrectoBucle == true) {

			System.out.println("Introduce un Nº de 1 al 10");
			nCorrecto = entrada.nextInt();
			if (nCorrecto < 10 && nCorrecto > 0) {

				nCorrectoBucle = false;
			}

			for (int i = 0; i < matriz.length; i++) {
				if ((matriz[i] - nCorrecto) % 10 == 0) {
					contador++;

				}
			}
			int indice = 0;
			int matriz2[] = new int[contador];

			for (int i = 0; i < matriz.length; i++) {
				if ((matriz[i] - nCorrecto) % 10 == 0) {

				   matriz2[indice] = matriz[i];
				   indice++;
				}
			}
			
			for(int i=0; i< matriz2.length; i++) {
				
				System.out.println(matriz2[i]);
			}
		}
	}

}

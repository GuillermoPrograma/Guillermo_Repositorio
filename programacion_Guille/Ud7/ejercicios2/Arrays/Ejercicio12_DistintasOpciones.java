package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio12_DistintasOpciones {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String Letra = entrada.next();

		int Numeros[] = new int[10];
		boolean bucle = true;

		for (int i = 0; i < Numeros.length; i++) {

			Numeros[i] = (int) (1 + Math.random() * (10 - 1 + 1));

		}

		while (bucle == true) {
			if (Letra.equals("a")) {

				for (int i = 0; i < Numeros.length; i++) {

					System.out.println(Numeros[i]);

				}

			}
			if (Letra.equals("b")) {
				System.out.println("Valor V");
				int V = entrada.nextInt();
				System.out.println("Posición P");
				int P = entrada.nextInt();

				Numeros[P] = V;
				Letra = ("");
			}
			
			
			Letra = entrada.next();
			
			if (Letra.equals("c")) {
				bucle = false;

			}
			
		}
	}

}

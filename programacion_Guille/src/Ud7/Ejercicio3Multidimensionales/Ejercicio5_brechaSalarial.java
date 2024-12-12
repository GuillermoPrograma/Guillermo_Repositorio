package Ud7.Ejercicio3Multidimensionales;

import java.util.Scanner;

public class Ejercicio5_brechaSalarial {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Numero de trabajadores");
		int n = entrada.nextInt();

		int trabajadores[][] = new int[n][2];

		int sueldo = 0;
		int genero = 0;

		for (int i = 0; i < trabajadores.length; i++) {

			for (int j = 0; j < trabajadores[i].length; j++) {

				System.out.println("Sueldo: ");
				sueldo = entrada.nextInt();
				System.out.println("Genero: ");
				genero = entrada.nextInt();
				trabajadores[i][j] = sueldo;
				trabajadores[i][j] = genero;
			}

		}

		for (int i = 0; i < trabajadores.length; i++) {

			for (int j = 0; j < trabajadores[i].length; j++) {

				System.out.print(trabajadores[i][j] + "\t");
			}
			
		}

	}

}

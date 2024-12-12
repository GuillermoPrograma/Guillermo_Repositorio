package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio3_HermanoMayor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Edad Hermano 1");

		int hermano1 = entrada.nextInt();

		System.out.println("Edad Hermano 2");

		int hermano2 = entrada.nextInt();

		entrada.close();

		if (hermano1 > hermano2) {

			System.out.println("Hermano 1 es mayor");

		} else if (hermano1 < hermano2) {

			System.out.println("Hermano 2 es mayor");

		} else {

			System.out.println("Misma Edad");

		}

	}

}

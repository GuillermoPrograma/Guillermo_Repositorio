package Ud4.ejercicios.bucles3;

import java.util.Scanner;

public class Ejercicio1_Cuadrado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int NumEleg = entrada.nextInt();
		boolean bucle = true;
		int NumContador = NumEleg;
		int NumInicial = NumEleg;
		while (bucle == true) {

			for (int l = 1; l <= (NumEleg); l++) {

				if (NumInicial == NumEleg) {

					for (int i = 1; i <= NumEleg; i++) {
						System.out.print("* ");
						NumInicial--;
						
					}

					System.out.println();
				}

				if (l == 1 || l == NumEleg) {

					System.out.print("* ");
				} else {

					System.out.print("  ");
				}
			}

			System.out.println();
			NumContador--;
			if (NumContador == 1) {
				for (int i = 1; i <= NumEleg; i++) {
					System.out.print("* ");
				}
			}
			if (NumContador == 0) {

				bucle = false;

			}

		}

	}
}

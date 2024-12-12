package Ud4.ejercicios.bucles2;

import java.util.Scanner;

public class Ejercicio8_Pirámide {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige un número");
		int numEleg = entrada.nextInt();
		boolean bucle = true;
		int NumBucle = 0;
		int Numespacio = numEleg;

		while (bucle == true) {

			for (int l = 1; l <= Numespacio; l++) {
				System.out.print(" ");

			}
			NumBucle++;

			for (int i = 1; i <= NumBucle; i++) {

				System.out.print("* ");

			}

			System.out.println("");
			numEleg--;
			Numespacio--;
			if (numEleg == 0) {
				bucle = false;
			}

		}
	}
}

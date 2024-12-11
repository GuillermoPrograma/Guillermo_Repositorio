package Ud4.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio4_LetrasHastaVocal {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean bucle = true;

		while(bucle == true) {
			System.out.println("Dime una letra");
			char letra = entrada.next().charAt(0);
			

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				System.out.println("mala");
				entrada.close();
				bucle = false;
			}

		}
	}
}

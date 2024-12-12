package Ud7.ejercicios5.Arrays.String;

import java.util.Scanner;

public class Ejercicio5_Palindromo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String frase = entrada.nextLine();

		String cadena[] = frase.split(" ");

		boolean palindromo = false;

		String cadena2[] = new String[cadena.length];

		String reves = "";

		String cadena3 = "";

		String cadena4 = "";

		for (int i = 0; i < cadena.length; i++) {
			for (int j = cadena[i].length() - 1; j >= 0; j--) {

				reves = reves + cadena[i].substring(j, j + 1);

			}

			cadena2[cadena.length - i - 1] = reves;
			reves = "";

			}

			for (int i = 0; i < cadena.length; i++) {
	
				cadena3 = cadena[i];
				cadena4 = cadena2[i];
			}

		palindromo = cadena3.equalsIgnoreCase(cadena4);

			if (palindromo == true) {
	
				System.out.println("es Palindromo");
			}
			if (palindromo == false) {
	
				System.out.println("No es Palindromo");
			}

	}

}

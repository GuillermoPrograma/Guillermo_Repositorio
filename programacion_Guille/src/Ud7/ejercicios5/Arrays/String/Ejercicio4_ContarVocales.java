package Ud7.ejercicios5.Arrays.String;

import java.util.Scanner;

public class Ejercicio4_ContarVocales {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase = entrada.nextLine().toLowerCase();
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

		for (int i = 0; i < frase.length(); i++) {
			char palabra = frase.charAt(i);

			if (palabra == 'a') {
				
				contA++;
			}
			if (palabra == 'e') {
				
				contE++;
			}
			if (palabra == 'i') {
				
				contI++;
			}
			if (palabra == 'o') {
	
				contO++;
			}
			if (palabra == 'u') {
	
				contU++;
			}
			
		}
		
		System.out.println("Nº de As : " + contA);
		System.out.println("Nº de Es : " + contE);
		System.out.println("Nº de Is : " + contI);
		System.out.println("Nº de Os : " + contO);
		System.out.println("Nº de Us : " + contU);
	}

}

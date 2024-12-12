package Ud4.ejercicios;

import java.util.Scanner;

public class Ejericico_16_Dado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int DadoCara;

		System.out.println("¿Cómo ha caído el dado?");
		DadoCara = entrada.nextInt();
		entrada.close();

		switch (DadoCara) {
		

		case (1):
			System.out.println("El Lado contrario es Seis");
			break;

		case (2):
			System.out.println("El Lado contrario es Cinco");
			break;

		case (3):
			System.out.println("El Lado contrario es Cuatro");
			break;

		case (4):
			System.out.println("El Lado contrario es Tres");
			break;
		case (5):
			System.out.println("El Lado contrario es Dos");
			break;
		case (6):
			System.out.println("El Lado contrario es Uno");
			break;

		default:
			System.out.println("No es el Número Correcto");
			break;

		}

	}

}

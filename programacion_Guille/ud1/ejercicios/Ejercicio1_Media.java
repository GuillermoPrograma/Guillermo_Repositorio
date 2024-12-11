package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio1_Media {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Pon Numero 1");

		double numero1 = scanner.nextFloat();

		System.out.println("Pon Numero 2");
		double numero2 = scanner.nextFloat();

		System.out.println("Pon Numero 3");
		double numero3 = scanner.nextFloat();

		System.out.println("la media es " + (numero1 + numero2 + numero3) / 3);
		
		scanner.close();
	}

}

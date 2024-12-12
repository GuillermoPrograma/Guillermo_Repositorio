package Ud5.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_Capicua {
	public static void main(String[] args) {
		boolean capicua = false;
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		String cadena = numero + "";
		String cadena2 = descomponer(numero);
		capicua = comparar(cadena, cadena2);
		if (capicua == true) {

			System.out.println("Es capicua!!");
		} else {

			System.out.println("No es capicua");
		}
	}

	public static String descomponer(int numero) {
		String numeroDescompuesto = "";
		while (numero > 0) {

			numeroDescompuesto = numeroDescompuesto + numero % 10;
			numero = numero / 10;

		}
		System.out.println(numeroDescompuesto);
		return numeroDescompuesto;
	}

	public static boolean comparar(String cadena, String cadena2) {

		boolean capicua = cadena.equals(cadena2);
		return capicua;

	}
}

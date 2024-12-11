package Ud5_Ejercicios_2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ponme un numero decimal");
		int numero = entrada.nextInt();
		System.out.println(pasarBinario(numero));
	}

	public static String pasarBinario(int numero) {

		String bin = "";
		while (numero > 0) {
			bin = numero % 2 + bin;
			numero = numero / 2;

		}

		return bin;
	}
}

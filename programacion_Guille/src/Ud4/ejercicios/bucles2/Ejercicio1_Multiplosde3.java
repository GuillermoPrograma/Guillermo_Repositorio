package Ud4.ejercicios.bucles2;

import java.util.Scanner;

public class Ejercicio1_Multiplosde3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el numero que quieras multiplo de 3");
		int Numerodado = entrada.nextInt();
		int NumeroMultiplo = 0;

		Numerodado = Numerodado / 3;

		for (int i = 1; i <= Numerodado; i++) {
			NumeroMultiplo++;

		}
		System.out.println("Cantidad de números de 3: " + NumeroMultiplo);

	}
}

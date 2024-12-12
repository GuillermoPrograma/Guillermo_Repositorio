package Ud4.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio9_SecuenciaDeNotas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int Notas = 0;
		int Dieces = 0;

	while (Notas != -1) {

			Notas = entrada.nextInt();

			if (Notas == 10) 
			{
				Dieces++;
			}

		}

		System.out.println("Ha habido " + Dieces + " Dieces");

	}

}

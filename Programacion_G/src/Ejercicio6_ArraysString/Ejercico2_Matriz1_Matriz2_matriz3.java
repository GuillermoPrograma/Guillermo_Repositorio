package Ejercicio6_ArraysString;

import java.util.Scanner;

public class Ejercico2_Matriz1_Matriz2_matriz3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Pon longitud Matrices :");
		int parametros = entrada.nextInt();

		int numeros[] = new int[parametros];

		int numero2[] = new int[parametros];

		int numero3[] = new int[parametros];

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (4 + Math.random() * (6 - 4 + 1));
			numero2[i] = numeros[i];

		}
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (4 + Math.random() * (6 - 4 + 1));
			
			
			numero3[i] = numeros[i] * numero2[i];
			
		}
		for (int i = 0; i < numeros.length; i++) {

			System.out.print(" Matriz 1 = " + numeros[i]);

		}
		System.out.println(" ");
		for (int i = 0; i < numeros.length; i++) {

			System.out.print(" Matriz 2 = " + numero2[i]);

		}
		System.out.println(" ");
		for (int i = 0; i < numeros.length; i++) {

			System.out.print(" Multiplicacion Matrices = " + numero3[i]);
			

		}
	}

}

package practica2;

import java.util.Scanner;

public class Ejercicio4_Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeros[][] = new int[5][5];

		int sumaFilas = 0;
		int sumaColumnas = 0;
		int sumaDiagonal = 0;
		int sumatotal = 0;
		int diagonalInversa = 0;
		int CompNumeros[][] = new int[5][5];
		boolean simetrica = true;

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				numeros[i][j] = (int) (1 + Math.random() * (100 - 1 + 1));
				System.out.print(numeros[i][j] + "\t");

			}
			System.out.println(" ");

		}
		System.out.println(" ");

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				sumaFilas += numeros[i][j];
				CompNumeros[i][j] = numeros[i][j];
			}

			System.out.println("La suma de la fila " + i + " : " + sumaFilas);
			sumatotal += sumaFilas;
			sumaFilas = 0;
		}

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				sumaColumnas += numeros[j][i];

			}
			System.out.println("la suma de la columna " + i + " : " + sumaColumnas);
			sumaColumnas = 0;
		}
		for (int i = 0; i < numeros.length; i++) {

			sumaDiagonal += numeros[i][i];

		}
		System.out.println("la suma de la Diagonal es : " + sumaDiagonal);
		System.out.println("la suma total de todos los digitos es : " + sumatotal);

		/* dar valor al cuadrado */

		for (int i = 0; i < numeros.length; i++) {

			diagonalInversa = (int) Math.pow(numeros[i][numeros.length - i - 1], 2);

			numeros[i][numeros.length - i - 1] = diagonalInversa;

			for (int j = 0; j < numeros[i].length; j++) {

				System.out.print(numeros[i][j] + "\t");
			}
			// }
			diagonalInversa = 0;
			System.out.println(" ");
			
		}
		System.out.println(" ");

		// creo Matriz Traspuesta

		for (int i = 0; i < numeros[0].length; i++) {
			for (int j = 0; j < numeros.length; j++) {

				System.out.print(numeros[j][i] + "\t");
				
				
			if (CompNumeros[i][j] != numeros[j][i]) {

					simetrica = false;
			}

			}
			System.out.println(" ");
			}
			if (simetrica == true) {

			System.out.println("Es Simetrica");
		}

	
		
	}
}

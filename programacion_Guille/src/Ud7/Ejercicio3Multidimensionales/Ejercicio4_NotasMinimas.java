package Ud7.Ejercicio3Multidimensionales;

import java.util.Scanner;

public class Ejercicio4_NotasMinimas {

	public static void main(String[] args) {

		int Alumnos[][] = new int[4][5];
		Scanner entrada = new Scanner(System.in);
		int max = 0;
		int min = 100;
		int media = 0;
		for (int i = 0; i < Alumnos.length; i++) {

			for (int j = 0; j < Alumnos[i].length; j++) {

				System.out.println("Alumno " + i + " Nota " + j);
				Alumnos[i][j] = entrada.nextInt();

			}

		}
		for (int i = 0; i < Alumnos.length; i++) {

			for (int j = 0; j < Alumnos[i].length; j++) {

				media += Alumnos[i][j] / Alumnos[i].length;
				if (max < Alumnos[i][j]) {

					max = Alumnos[i][j];

				}
				if (min > Alumnos[i][j]) {

					min = Alumnos[i][j];

				}
				
			}
			System.out.println("Alumno "  + i);
			System.out.println("Media :"  + media);
			System.out.println("Máximo :" + max);
			System.out.println("Mínimo :" + min);
			media = 0;
		}

	}
}

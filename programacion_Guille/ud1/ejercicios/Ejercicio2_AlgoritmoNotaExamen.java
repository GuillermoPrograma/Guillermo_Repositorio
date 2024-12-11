package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio2_AlgoritmoNotaExamen {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuantas respuestas correctas");
		int PreguntasCorrectas = entrada.nextInt();

		System.out.println("Cuantas respuestas incorrectas");

		int PreguntasIncorrectas = entrada.nextInt();

		System.out.println("La nota del Examen es" + ((PreguntasCorrectas * 4) - (PreguntasIncorrectas)));

		entrada.close();

	}

}

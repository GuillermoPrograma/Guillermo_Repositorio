package Ud7ejercicios4.Arrays;

public class Ejercicio2_Saboteadores {

	public static void main(String[] args) {

		int NumAle = (int) (Math.random() * 10) + 3;
		int vector1[] = new int[NumAle];
		int vector2[] = new int[NumAle];

		for (int i = 0; i < vector1.length; i++) {

			vector1[i] = (int) (Math.random() * 50) + 1;

		}
		for (int i = 0; i < vector2.length; i++) {

			vector2[i] = (int) (Math.random() * 50) + 1;

		}

		int vector3[] = new int[NumAle];

		for (int i = 0; i < vector1.length; i++) {

			vector3[i] = vector2[i] + vector1[i];
			System.out.println("vector 1: " + vector1[i]);
			System.out.println("vector 2: " + vector2[i]);
			System.out.println("La suma de los 2 : " + vector3[i]);

		}

	}

}

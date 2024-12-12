package Ud7.ejercicios2.Arrays;

public class Ejercicio11_DosArrays {

	public static void main(String[] args) {

		int Numeros1[] = new int[100];
		int Numeros2[] = new int[100];

		for (int i = 0; i < Numeros1.length; i++) {

			Numeros1[i] = i + 1;
			System.out.println(Numeros1[i]);
		}
		for(int i = 0; i< Numeros2.length; i++) 
		{
			
			Numeros2[i] = Numeros2.length - i;
			System.out.println(Numeros2[i]);
		}
	}

}

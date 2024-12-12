package Ud5.Ejercicio2;

import java.util.Scanner;

public class Ejercicio3_SumaMatrices {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce las dimensiones");
		int dim = entrada.nextInt();
		int matriz[] = new int[dim];
		int matriz2[] = new int[dim];
		matriz =colocarNumeros(matriz);
		matriz2 = colocarNumeros(matriz2);
		
		sumaMatrices(matriz, matriz2);

	}
	
	public static int[] colocarNumeros(int[] matriz) {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			
			System.out.println("Introduce el valor de la matriz" + i);
			matriz[i] = entrada.nextInt();
			
		}
		
		return matriz;
	}
	public static void sumaMatrices(int[] matriz, int[] matriz2) 
	{
		int matriz3[] = new int[matriz.length];
		System.out.println("El resultado de la suma de las 2 matrices es " );
		for(int i = 0; i < matriz.length; i++) 
		{
			
		matriz3[i] =	matriz[i] + matriz2[i];
		
		System.out.println(matriz3[i]);
		
		}
		
		
	}

}

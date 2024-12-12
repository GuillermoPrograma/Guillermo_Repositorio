package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio13_SecuenciaAritmetica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("El valor de V");
		int V = entrada.nextInt();
		System.out.println("El valor de P");
		int P = entrada.nextInt();
		System.out.println("El valor de N");
		int N = entrada.nextInt();
		
		int Numeros[] = new int[N];
		for(int i = 0; i < Numeros.length;i++) 
		{
			if (i == 0) 
			{
				Numeros[i] = V;
			}
			else {
				
			Numeros[i] += (V + P*i); 	
			}
			
			System.out.print(Numeros[i] + " ");
		}
		
	}
	
	
}

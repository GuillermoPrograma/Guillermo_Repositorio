package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio2_SumaNumerosReales {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Numeros[] = new int [10];
		int Numero = 0;
		
		for(int i = 0;i<10;i++) 
		{
			
		 Numeros[i] = entrada.nextInt();
			
		}
		for(int i = 0;i<10;i++) 
		{
			
			Numero += Numeros[i];
		}
		System.out.println(Numero);
	}
}

package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio1_DiezNumerosReales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Numeros[] = new int [10];
		
		
		for(int i = 0;i<10;i++) 
		{
			
		 Numeros[i] = entrada.nextInt();
			
		}
		for(int i = 0;i<10;i++) 
		{
			
		System.out.print(Numeros[i]);
			
		}
	}
	
	
}

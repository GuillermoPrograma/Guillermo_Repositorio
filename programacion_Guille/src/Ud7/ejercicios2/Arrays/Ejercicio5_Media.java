package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio5_Media {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Numeros[] = new int [20];
		int Numero = 0;
		
		
		for(int i = 0;i<Numeros.length;i++) 
		{
			
		 Numeros[i] = entrada.nextInt();
			
		}
		for(int i = 0;i<Numeros.length;i++) 
		{
			Numero += Numeros[i];
			
			
		}
			Numero = Numero / Numeros.length;
		
		System.out.println("Media Numero = " + Numero);
		
		
		}
	
	
}

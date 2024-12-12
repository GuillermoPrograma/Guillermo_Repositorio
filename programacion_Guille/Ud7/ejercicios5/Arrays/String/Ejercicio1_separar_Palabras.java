package Ud7.ejercicios5.Arrays.String;

import java.util.Scanner;

public class Ejercicio1_separar_Palabras {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String frase;
		
		frase = entrada.nextLine();
		
		
		String[] cadena = frase.split(" ");
		
		for(int i = 0; i < cadena.length; i++) 
		{
			
			System.out.println(cadena[i]);
			
		}
		
		
	}
}

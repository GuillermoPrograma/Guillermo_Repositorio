package Ud7.ejercicios5.Arrays.String;

import java.util.Scanner;

public class Ejercicio_2_MayusculasMinusculas {

	
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Palabra 1 : ");
		String frase1 = Entrada.nextLine();
		System.out.println("Palabra 2 : ");
		String frase2 = Entrada.nextLine();
		
		boolean igual= false;
		boolean igualMay = false;
		
		igual  = frase1.equals(frase2);
		if (igual == true) 
		{
			
			System.out.println("Son iguales");
			
		}
		igualMay = frase2.equalsIgnoreCase(frase1);
		if(igualMay == true && igual == false) 
		{
			
			System.out.println("Son iguales pero con Mayusculas diferentes");
		}
	}
}

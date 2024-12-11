package Ud4.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio3_MenosyMayoresdeEdad {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Dame el numero de personas");
	int numerodePersonas = entrada.nextInt();
	int mayordeEdad = 0;
	int menordeEdad = 0;
	int i = 0;
	
	for (  i =0; i<=numerodePersonas; i++) 
	{
		System.out.println("Edad persona " + i);
		int edadPersonaActual = entrada.nextInt();
		if(edadPersonaActual < 18) {
		
		menordeEdad =	menordeEdad + 1;	
			
			
		}
		else 
		{
			mayordeEdad = mayordeEdad + 1;
			
		}
		
	}
	
		System.out.println("Menores de Edad " + menordeEdad);
		System.out.println("Mayores de Edad " + mayordeEdad);
		entrada.close();
			
}
}

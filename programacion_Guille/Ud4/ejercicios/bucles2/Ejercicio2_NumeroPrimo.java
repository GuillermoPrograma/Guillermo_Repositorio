package Ud4.ejercicios.bucles2;

import java.util.Scanner;

public class Ejercicio2_NumeroPrimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Dime el Número : ");
		double Numerodado = entrada.nextInt();
		boolean esPrimo=true;
		
		for(int i = 1;i<=100;i++) {
			if(i!= Numerodado && i!= 1) 
			{
				if(Numerodado % i ==0 ) 
				{
					esPrimo =false;
					
				}
				
				
				
			}
			
			
			
		}
		if (esPrimo == true) 
		{
			System.out.println("Es Número Primo");
			
		}
		else 
		{
			System.out.println("No es Primo");
			
		}
		
	}
}

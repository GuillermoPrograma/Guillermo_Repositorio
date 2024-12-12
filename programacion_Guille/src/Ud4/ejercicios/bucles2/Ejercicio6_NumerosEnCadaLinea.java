package Ud4.ejercicios.bucles2;

import java.util.Scanner;

public class Ejercicio6_NumerosEnCadaLinea {

	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner (System.in);
		System.out.print("Dime un Numero entre 5 y 20 ");
		int numDado = Entrada.nextInt();
		int numBucle = 0;
		int Num3 = 0;
		if(numDado < 5 || numDado > 20) 
		{
			System.out.println("Numero Incorrecto repite Numero: ");
			numDado = Entrada.nextInt();
		}
		
		numBucle = numDado;
		
		for(int i = 1; i<= numDado;i++) 
		{
			
			Num3 = numDado - (numDado - i);
			for(int l = 1; l<= Num3; l++) 
			{
				System.out.print(Num3);
				
		
			}
			System.out.println("");
		}
			
			
		
		
		
		
	}
	
}

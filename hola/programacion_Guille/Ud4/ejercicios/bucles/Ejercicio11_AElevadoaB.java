package Ud4.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio11_AElevadoaB {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Numero A");
		int NumeroA = entrada.nextInt();
		System.out.println("Numero B");
		int NumeroB = entrada.nextInt();
		int Resultado = NumeroA;
		
		
		for(int i=1;i <= NumeroB;i++) 
		{
			Resultado = Resultado * NumeroA;
			System.out.println("Resultado " + Resultado);
		}
		
		 System.out.println("Resultado " + Resultado);
	
		
		
	}

}

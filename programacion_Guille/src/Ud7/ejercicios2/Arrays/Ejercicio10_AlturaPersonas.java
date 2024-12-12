package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio10_AlturaPersonas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Cuantas alturas quieres:");
		int N = entrada.nextInt();
		
		int Numeros[] = new int[N];
		int NumeroMin = 10000;
		int NumeroMax = 0;
		int contMin = 0;
		int contMax = 0;
		int Media = 0;
		for(int i = 0;i<Numeros.length;i++) 
		{
			System.out.println("Dame altura " + i);
			
			Numeros[i] = entrada.nextInt();
			
			if(NumeroMin > Numeros[i]) 
			{
				NumeroMin = Numeros[i];
				
			}
			
			if(NumeroMax < Numeros[i]) 
			{
				NumeroMax = Numeros[i];
				
			}
			
			Media += Numeros[i]/Numeros.length;
			
			
		}
		for(int l = 0;l<Numeros.length;l++)
		{
		
			if(NumeroMin < Numeros[l]) 
			{
				contMin++;
				
			}
			if(NumeroMax > Numeros[l]) 
			{
				contMax++;	
			}
			
		}
		System.out.println("Altura Máxima " + NumeroMax);
		System.out.println("Altura Mínima " + NumeroMin);
		System.out.println("Media " + Media );
		System.out.println("Personas por encima " + contMax );
		System.out.println("Personas por debajo " + contMin );
	}
	
	
}

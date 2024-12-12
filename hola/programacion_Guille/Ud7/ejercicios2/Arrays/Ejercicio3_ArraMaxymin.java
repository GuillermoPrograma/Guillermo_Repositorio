package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio3_ArraMaxymin {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Numeros[] = new int [10];
		int NumeroMax = 0;
		int NumeroMin = 100;
		
		for(int i = 0;i<10;i++) 
		{
			
		 Numeros[i] = entrada.nextInt();
			
		}
		for(int i = 0;i<10;i++) 
		{
			if(NumeroMax <= Numeros[i]) {
			NumeroMax = Numeros[i];	
			}
			if(NumeroMin >= Numeros[i]) {
			NumeroMin = Numeros[i];	
			}
			
			}
			
		System.out.println("Numero Máximo = " + NumeroMax);
		System.out.println("Numero Mínimo = " + NumeroMin);
		
		}
		
	}
	
	


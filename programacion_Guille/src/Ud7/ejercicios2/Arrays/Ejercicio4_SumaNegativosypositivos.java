package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio4_SumaNegativosypositivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Numeros[] = new int [20];
		int Numpos = 0;
		int Numneg = 0;
		
		for(int i = 0;i<Numeros.length;i++) 
		{
			
		 Numeros[i] = entrada.nextInt();
			
		}
		for(int i = 0;i<Numeros.length;i++) 
		{
			if(Numeros[i] >= 0) {
			Numpos += Numeros[i];	
			}
			if(Numeros[i] <= 0) {
			Numneg += Numeros[i];	
			}
			
			}
			
		System.out.println("Numero Positivo = " + Numpos);
		System.out.println("Numero Negativo = " + Numneg);
		
		}
}

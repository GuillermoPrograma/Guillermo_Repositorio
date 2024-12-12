package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio7_PyQ {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("P");
		int P = entrada.nextInt();
		System.out.println("Q");
		int Q = entrada.nextInt();
		int Num = 0;
		
		for(int i = P;i<Q;i++) 
		{
			
		Num = i;	
		}
		int Numeros[] = new int [Num];
		
		
		for(int i = P;i<Numeros.length;i++) 
		{
			
			Numeros[i] = i;
			System.out.println(Numeros[i]);
		}
			
		
				
		
		}
}

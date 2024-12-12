package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio6_Valores_N_y_M {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("N");
		int N = entrada.nextInt();
		System.out.println("M");
		int M = entrada.nextInt();
		int Numeros[] = new int [N];
		
		for(int i = 0;i<Numeros.length;i++) 
		{
			
		Numeros[i] = M;
			
		}
		for(int i = 0;i<Numeros.length;i++) 
		{
			
			System.out.print(Numeros[i]);
			
		}
			
		
				
		
		}
}

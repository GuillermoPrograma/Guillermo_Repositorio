package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio8_NumAleatorio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("R");
		int R = entrada.nextInt();
	
		int Num = 0;
		int Numeros[] = new int[100];
		
		for(int i = 0;i<Numeros.length ;i++) 
		{
			Numeros[i] = (int) (1 + Math.random() * (100 - 1 + 1));
		}
		
		
		
		for(int i = 0;i<Numeros.length;i++) 
		{
			
			if(Numeros[i] >= R) 
			{
				
				Num++;
			}
		}
			
		System.out.println(Num);
				
		
		}
}

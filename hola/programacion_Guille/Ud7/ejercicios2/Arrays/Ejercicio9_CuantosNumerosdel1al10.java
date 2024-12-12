package Ud7.ejercicios2.Arrays;

import java.util.Scanner;

public class Ejercicio9_CuantosNumerosdel1al10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int Numeros[] = new int[100];
		
		System.out.println("Pon Numero");
		int NumEleg = entrada.nextInt();
		int N = 0;
		for(int i=0; i <Numeros.length; i++) 
		{
			
			Numeros[i] =(int) (1 + Math.random() * (10 - 1 + 1));
		
			if(NumEleg == Numeros[i]) 
			{
				N++;
				
			}
			
		}
		
		System.out.println("n ha salido " + N + " veces");
		
	}

}

package Practica2_Arrays_ejercicios;

import java.util.Scanner;

public class Ejercicio3_SustituirValores {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeros[] = new int[20];

		int valorAnter = 0;
		int valorNuevo = 0;

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (0 + Math.random() * (20 - 0 + 1));

			System.out.println("Numero " + i + ": " + numeros[i]);

		}
		
		System.out.println("Valor que quieres cambiar : ");
		valorAnter = entrada.nextInt();
		System.out.println("Valor Nuevo :");
		valorNuevo = entrada.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {

			if(numeros[i] == valorAnter) 
			{
				
				numeros[i] = valorNuevo;
				
			}

			System.out.println("Numero " + i + ": " + numeros[i]);
			
		}
	}

}

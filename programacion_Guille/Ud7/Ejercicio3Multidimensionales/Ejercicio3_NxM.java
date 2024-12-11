package Ud7.Ejercicio3Multidimensionales;

import java.util.Scanner;

public class Ejercicio3_NxM {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introducir N");
		int N = entrada.nextInt();
		
		System.out.println("Introducir M");
		int M = entrada.nextInt();
		int menor = 0;
		int mayor = 0;
		int igual = 0;
		int Numeros[][] = new int[N][M];
		
		for(int i = 0; i< Numeros.length;i++) {
			
			for(int j = 0; j< Numeros[i].length; j++) {
				
				System.out.println("Introducir el Numero " + i + " " + j);
				Numeros[i][j] = entrada.nextInt();
				
				
			}
			
		}
		
		for(int i = 0; i< Numeros.length;i++) 
		{
			
			for(int j = 0; j< Numeros[i].length; j++) {
				
				if( Numeros[i][j] <0) {
					
					 menor ++;
				}
				if( Numeros[i][j] ==0) {
					
					 igual ++;
				}
				if( Numeros[i][j] >0) {
					
					 mayor ++;
				}
				
			}
			
		}
		System.out.println("Mayor que 0 " + mayor);
		System.out.println("Menor que 0 " + menor);
		System.out.println("igual que 0 " + igual);
	}
	
	
}

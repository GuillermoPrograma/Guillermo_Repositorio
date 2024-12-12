package Ud4.ejercicios.bucles2;

import java.util.Scanner;

public class Ejercicio5_NumAsterisco {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime un número : ");
		int Numerodado = entrada.nextInt();
		
		
		for(int i = 1;i<=Numerodado;i++) 
		{
			System.out.print("* ");
			
			
		}
	}

}

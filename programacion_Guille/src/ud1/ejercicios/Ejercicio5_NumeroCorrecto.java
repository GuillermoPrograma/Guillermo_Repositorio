package ud1.ejercicios;

import java.util.Scanner;

public class Ejercicio5_NumeroCorrecto {
	
	
	public static void main(String[] args) {
		
		int i = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número correcto");
		
		int numeroCorrecto = entrada.nextInt();
		
		System.out.println("Introduce un número Aleatorio");
		
		int numeroAleatorio = entrada.nextInt();
		
		
		for (i=0;i<2000;i++)
		{
			
			
			if (numeroAleatorio > numeroCorrecto) 
			{
				System.out.println("El Número aleatorio es mayor");
				numeroAleatorio = entrada.nextInt();
				
			}
			else if (numeroAleatorio < numeroCorrecto) 
			{
				System.out.println("El Número aleatorio es menor");
				numeroAleatorio = entrada.nextInt();
				
			}
			else 
			{
				System.out.println("Has acertado");
				entrada.close();
				break;
			}
			
			
		}
		
	}

}

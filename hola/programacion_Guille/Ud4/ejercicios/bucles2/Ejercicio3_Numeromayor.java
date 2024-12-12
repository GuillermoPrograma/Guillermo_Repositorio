package Ud4.ejercicios.bucles2;

import java.util.Scanner;

public class Ejercicio3_Numeromayor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Variables
		int numIntento = 1, numFallos = 0;
		boolean bucle = true;

		// Variables numero

		int Numero1 = 0, Numero2 = 0;
		// Bucle
		while (bucle == true) {

			System.out.println("Dime un numero 1:");
			Numero1 = entrada.nextInt();
			
			if (Numero1 == 0) {
				
				bucle = false;
			}
			else if (Numero1 != 0) 
			{
				System.out.println("Dime un numero 2:");
				Numero2 = entrada.nextInt();
				
			}

			

			if(Numero2 == 0) {
				
				bucle = false;
			}

			if (Numero1 > Numero2) {

				numFallos++;
				numIntento++;
				System.out.println("Fallo, es menor");
			} else if (Numero2 >= Numero1) {

				numIntento++;
			}

		}
		System.out.println("Numeros Introducidos : " + numIntento + " Numero de fallos: " + numFallos);

	}
}

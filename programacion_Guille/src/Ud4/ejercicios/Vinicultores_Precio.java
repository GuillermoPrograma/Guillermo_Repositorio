package Ud4.ejercicios;

import java.util.Scanner;

public class Vinicultores_Precio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean tipoA;
		boolean tamaño1;

		double precioUva;

		System.out.println("Dime el precio del Kilo de uvas");
		precioUva = entrada.nextDouble();

		System.out.println("¿Es tipo A?");
		tipoA = entrada.nextBoolean();

		System.out.println("¿Tiene Tamaño 1?");
		tamaño1 = entrada.nextBoolean();
		
		entrada.close();
		
		if (tipoA == true) {
			if (tamaño1 == true) {
			
				
				System.out.println("El precio final es" + precioUva + 0.20);

			} else {

				System.out.println("El precio final es" + precioUva + 0.30);

			}

		} else {
			if (tamaño1 == true) {

				System.out.println("El precio final es" + (precioUva - 0.30));

			} else {
				System.out.println("El precio final es" + (precioUva - 0.50));

			}

		}

	}

}

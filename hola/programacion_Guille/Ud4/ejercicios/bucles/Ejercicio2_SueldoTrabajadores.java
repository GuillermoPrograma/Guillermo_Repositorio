package Ud4.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio2_SueldoTrabajadores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double sueldosTotales = 0;

		int i = 1;
		for (i = 1; i <= 20; i++) {
			System.out.println("Pon Sueldo " + i);
			double sueldoPuntual;
			sueldoPuntual = entrada.nextDouble();

			sueldosTotales = sueldosTotales + sueldoPuntual;
			
		}
		
			
			System.out.println("La media es " + sueldosTotales / i);
			entrada.close();

		
		
		
	
	}
}

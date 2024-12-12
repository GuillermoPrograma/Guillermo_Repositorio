package Ud4.ejercicios;

import java.util.Scanner;

public class Longitud_Circunferencia_Volumen {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double radio;

		radio = entrada.nextDouble();

		System.out.println("La longitud de la circunferencia es " + (radio * (2 * Math.PI)));
		System.out.println("El área del círculo es " + ((radio * radio) * Math.PI));
		System.out.println("El volumen de la esfera es " + (((4 / 3) * Math.PI) * (radio * radio * radio)));
		entrada.close();
		
	}
}

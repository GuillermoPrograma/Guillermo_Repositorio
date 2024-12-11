package Ud4.ejercicios;

import java.util.Scanner;

public class Suma_Resta_Multiplicacion_Division {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Numero1;
		int Numero2;
		
		System.out.println("Dame Numero 1");
		Numero1 = entrada.nextInt();
		
		System.out.println("Dame Numero 2");
		Numero2 = entrada.nextInt();
		
		System.out.println("La suma de los dos Números es " + (Numero1 + Numero2));
		System.out.println("La resta de los dos Números es " + (Numero1 - Numero2));
		System.out.println("La multiplicación de los dos Números es " + (Numero1 * Numero2));
		System.out.println("La división de los dos Números es " + (Numero1 / Numero2));
		entrada.close();
		
		
	}

}

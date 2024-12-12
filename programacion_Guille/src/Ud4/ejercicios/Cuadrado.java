package Ud4.ejercicios;

import java.util.Scanner;

public class Cuadrado {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double ladoDelCuadrado;
		double areaDelCuadrado;
		
		System.out.println("Dame el lado del cuadrado");
		
		ladoDelCuadrado = entrada.nextDouble();
		areaDelCuadrado = (ladoDelCuadrado * ladoDelCuadrado);
		
		System.out.println("El área del cuadrado es " + areaDelCuadrado);
		entrada.close();
	}

}

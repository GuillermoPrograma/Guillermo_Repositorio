package Ud4.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio6_Factorial {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int NumeroFactorial = 1;
	int NumeroBucle;
	int NumeroInicial = 0;
	NumeroInicial = entrada.nextInt();
	NumeroBucle = NumeroInicial;
	
	
	for (int i = 1; i < NumeroBucle; i++) {
		
		NumeroFactorial = NumeroInicial * NumeroFactorial;
		NumeroInicial = NumeroBucle - i;
		System.out.println("El Numero factorial es " + NumeroFactorial);
		
		
	}
	
}
}

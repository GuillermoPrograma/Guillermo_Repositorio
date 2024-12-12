package Ud7.ejercicios.Arrays;

import java.util.Scanner;

public class Ejercicio1_mediaarray {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int Notas[] = new int [6];
	int resultado = 0;
	
	
	
	for(int i =0; i<Notas.length;i++) {
	
		System.out.println("Dime la nota Número " + i);
		Notas[i] = entrada.nextInt();
		resultado += Notas[i];
	}
	
	resultado = resultado/ Notas.length;
	System.out.println("La media de las notas son " + resultado);
	entrada.close();
}


}

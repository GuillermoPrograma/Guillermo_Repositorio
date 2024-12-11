package Ejercicio6_ArraysString;

import java.util.Scanner;

public class Ejercicio4_DNI {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame Dni");
		int Dni = entrada.nextInt();
		boolean bucle = true;
		int numero = 0;
		String letra ="";
		String busca = "TRWAGMYFPDXBNJZSQVHLCKE";
		while (bucle == true) {

			if (Dni % 23 <= 22 && Dni % 23 >= 0) {

				bucle = false;
			}
			
		}
		numero = Dni % 23;
		
		letra = busca.substring(numero, numero +1);
		System.out.println(letra);
	}
}

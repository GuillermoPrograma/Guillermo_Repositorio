package Ejercicio6_ArraysString;

import java.util.Scanner;

public class Ejercicio6_Contraseña {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe contraseña:");
		String contraseña = entrada.next();
		int contador = 0;
		boolean acierto = false;
		
		while (contador <= 3 && acierto != true) {

			System.out.println("Intento" + contador);
			String Intento = entrada.next();
			if(Intento.equals(contraseña)) 
			{
				System.out.println("Acertarse");
				acierto = true;
			}
			else{
				System.out.println("Error");
				contador++;
				
			}
		}

	}
}

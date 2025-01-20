package Programacion_objeto_Ejercicio5_2.Contraseña;

import java.util.Scanner;

public class GeneraContrasenia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pasword contraseñas [] = new Pasword [entrada.nextInt()];
		for(int i = 0; i < contraseñas.length; i++) 
		{
			int longitud =(int) ((15 + Math.random() * (15 - 12 + 1)));
			contraseñas[i] = new Pasword(longitud);
			contraseñas[i].generarPassword();
			System.out.println("Contrasenia : " + i);
			System.out.println("Es fuerte :" + contraseñas[i].esFuerte());
			
			
		}
		
	}

}

package Ud7.ejercicios5.Arrays.String;

import java.util.Scanner;

public class Ejercicio3_TresCadenasDeTexto {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String Texto = entrada.nextLine();
		
		String cadena[] = Texto.split(" ");
		boolean incorrecto = true;
		String sub;
		
		
		while (incorrecto == true) {
		if(cadena.length != 3 ) 
		{
			System.out.println(cadena.length);
			 System.out.println("Incorrecto");
			  Texto = entrada.nextLine();
			  cadena = Texto.split(" ");
		}
		else 
		{
			System.out.println(cadena.length);
			incorrecto = false;
		}
		
		
		}
		for(int i= 0; i< cadena.length; i++) 
		{
			sub = cadena[i].substring(0,3);
			sub = sub.toUpperCase();
			System.out.print(sub);
		}
		
		
		
		
	}
}

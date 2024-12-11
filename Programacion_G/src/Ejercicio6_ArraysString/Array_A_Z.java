package Ejercicio6_ArraysString;

import java.util.Scanner;

public class Array_A_Z {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	String letras = "abcdefghijklmnopqrstuvwxyz";
	
	boolean bucle = true;
	int respuesta = 0;
	String letraIntermedio ="";
	
	int contador = 0;
	int intentos = 0;
	
	System.out.println("Numero de Intentos");
	intentos = entrada.nextInt();
	String letrasCadena [] = new String[intentos];
	while (bucle == true) {
		System.out.println("Dime un numero");
		respuesta = entrada.nextInt();
		if(respuesta <= 26 && respuesta > 0) {
			
			letraIntermedio =letras.substring(respuesta - 1, respuesta);
			
			System.out.println(letras.substring(respuesta - 1, respuesta ));
			
				
			letrasCadena[contador] = letras.substring(respuesta - 1, respuesta );
			contador++;	
			
		}
		if(respuesta > 26 || respuesta < -1) 
		{
			System.out.println("numero incorrecto");
			
		}
		if (respuesta == -1) 
		{
			for(int i = 0; i < letrasCadena.length; i++) {
				
				System.out.print(letrasCadena[i]);
				
			}
			
			bucle = false;
		}
	}
	
}
}

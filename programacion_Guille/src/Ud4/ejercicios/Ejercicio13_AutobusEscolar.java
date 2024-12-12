package Ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio13_AutobusEscolar {
 public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	  
	
	int numeroAlumnos =0;
	int precioTicket = 0;
	System.out.println("Indica número de alumnos");
	numeroAlumnos = entrada.nextInt();
	entrada.close();
	
	if (numeroAlumnos >= 100) 
	{
		precioTicket = 65;
		
		System.out.println("Cada alumno debe pagar " + precioTicket +" €");
	}
	if(numeroAlumnos >=50 && numeroAlumnos <= 90) 
	{
		precioTicket = 70;
		
		System.out.println("Cada alumno debe pagar " + precioTicket +" €");
		
	}
	if(numeroAlumnos >=30 && numeroAlumnos <= 49) 
	{
		precioTicket = 95;
		
		System.out.println("Cada alumno debe pagar " + precioTicket +" €");
		
	}
	if(numeroAlumnos < 30 ) 
	{
		precioTicket = (4000 / numeroAlumnos);
		
		System.out.println("Cada alumno debe pagar " + precioTicket +" €");
		
	}
}

}

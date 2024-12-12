package Ud4.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio_12_AdivinarNumero {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);

	int RangoMaximo = 100;
	int RangoMinimo = 0;
	boolean bucle = true;
	
	int NumeroIntento;
	char Char;
	
	while(bucle == true) { 
	

	NumeroIntento = (int) (RangoMinimo + Math.random() * (RangoMaximo - RangoMinimo + 1));
	
		System.out.println("El Numero es mayor, menor o igual " + NumeroIntento);
		Char = entrada.next().charAt(0);
		
		if(Char == '<') 
		{
			RangoMaximo = NumeroIntento -1 ;
			
		}
		if (Char == '>') 
		{
			RangoMinimo =NumeroIntento + 1;
		
			
		}
		if(Char == '=') {
			
			System.out.println("Acerté");
			bucle = false;
		}
		 if (RangoMaximo < RangoMinimo) 
		 {
			 System.out.println("No puede existir");
			 bucle = false;
		 }
	NumeroIntento = (int) (Math.random() * RangoMaximo) + RangoMinimo;
	
		System.out.println("El Numero es mayor, menor o igual " + NumeroIntento);
		Char = entrada.next().charAt(0);
		
		if(Char == '<') 
		{
			RangoMaximo = NumeroIntento -1 ;
			
		}
		if (Char == '>') 
		{
			RangoMinimo =NumeroIntento + 1;
		
			
		}
		if(Char == '=') {
			
			System.out.println("Acerté");
			bucle = false;
		}
		 

		
	
	}
}
}

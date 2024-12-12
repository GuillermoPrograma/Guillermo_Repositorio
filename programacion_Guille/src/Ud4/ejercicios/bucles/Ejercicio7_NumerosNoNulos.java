package Ud4.ejercicios.bucles;

public class Ejercicio7_NumerosNoNulos {

	
	public static void main(String[] args) {
	
		double Random;
		
		int NumeroPositivo= 0;
		
		int NumeroNegativo= 0;
		
		for (int i = 0; i <= 9; i++) 
		{
			
		Random =Math.floor(Math.random()*199) - 99;	
		
		if(Random > 0) 
		{
			NumeroPositivo++;
		
		}
		if(Random < 0) 
		{
			NumeroNegativo++;
			
		}
		if (Random==0) 
		{

			i= i -1;
		}
			
		}
		
		System.out.println("Los Numeros Negativos son " + NumeroNegativo + " Los Numeros Positivos son " + NumeroPositivo );
		
		
}
}

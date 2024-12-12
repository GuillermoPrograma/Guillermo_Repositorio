package Ud4.ejercicios.bucles;

public class Ejercicio10_SumaParesImpares {
	public static void main(String[] args) {
	
		int NumeroPar = 0;
		int NumeroImpar = 0;
		int Numero = 99;
		
	for(int i = 1; i < 100; i++) 
	{
		
	Numero ++;
		if(Numero % 2 == 0) 
		{
			NumeroPar += Numero;
			
		}
		else 
		{
			NumeroImpar+= Numero;
		}
		
		
		
	}
	System.out.println("Numeros total Pares " + NumeroPar + " Numeros total Impares " + NumeroImpar);
}
}

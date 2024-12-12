package Practica2_Arrays_ejercicios;

public class Ejercicio1_Numero_Cuadrado_cubo {

	
	public static void main(String[] args) {
		
		int numeros[] = new int [20];
		int cuadrado[] = new int[20];
		int cubos[] = new int [20];
		
		
		
		for(int i = 0; i < numeros.length; i++ ) 
		{
			
			numeros[i] = (int) (0 + Math.random() * (100 - 0 + 1));
			
		}
		for(int i = 0; i < cuadrado.length; i++) 
		{
			
			cuadrado[i] = numeros[i] * numeros[i];
			
		}
		for(int i = 0; i < cubos.length; i++) 
		{
			
			cubos[i] = numeros[i] * numeros[i] * numeros[i];
			
		}
		
		for(int i = 0; i < numeros.length; i++ ) 
		{
			
			System.out.println("Numeros " + i + ": " + numeros[i]);
			System.out.println("Cuadrados " + i + ": " + cuadrado[i]);
			System.out.println("Cubos " + i + ": " + cubos[i]);
		}
		
		
		
	}
}

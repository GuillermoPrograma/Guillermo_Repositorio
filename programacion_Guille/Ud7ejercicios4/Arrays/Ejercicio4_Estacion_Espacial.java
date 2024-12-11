package Ud7ejercicios4.Arrays;

public class Ejercicio4_Estacion_Espacial {
public static void main(String[] args) {
	
	int numeros[][] = new int[3][3];
	int numerosClon[][] = new int[3][3];
	for(int i = 0; i < numeros.length; i++) 
	{
		
		for(int j = 0; j < numeros[i].length; j++) 
		{
			
			numeros[i][j] = (int) (1 + Math.random() * (50 - 1 + 1));
			System.out.print(numeros[i][j] + "\t");
			
		}
		System.out.println(" ");
	}
	System.out.println(" "); //Separo un poco
	
	for(int i = 0; i < numeros.length; i++) 
	{
		
		for(int j = numeros[i].length - 1; j >= 0; j--) 
		{
			numerosClon[i][j] = numeros[j][i];
			
			System.out.print(numerosClon[i][j] + "\t");
			
		}
		System.out.println(" ");
	}
	
	
	
	
}
}

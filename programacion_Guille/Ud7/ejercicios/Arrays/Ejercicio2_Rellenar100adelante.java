package Ud7.ejercicios.Arrays;

public class Ejercicio2_Rellenar100adelante {
public static void main(String[] args) {
	
	
	int Numeros[] = new int [10];
	for(int i = 0; i<Numeros.length;i++) 
	{
		
		Numeros[i] = 100 + i;
		System.out.println(Numeros[i]);
	}
	
	
}
}

package Ud7.ejercicios.Arrays;

public class Ejercicio2_ArrayHacia_atras {
public static void main(String[] args) {
	
	int Numeros[] = new int [20];
	
	
	for(int i = 0; i < Numeros.length; i++) {
		
		Numeros[i] = Numeros.length - i;
		
		System.out.println(Numeros[i]);
		
	}
}
}

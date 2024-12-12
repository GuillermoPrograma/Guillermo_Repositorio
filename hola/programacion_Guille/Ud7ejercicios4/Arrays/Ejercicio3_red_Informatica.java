package Ud7ejercicios4.Arrays;

public class Ejercicio3_red_Informatica {

	public static void main(String[] args) {
		
		
		int numAle = (int) (int) (3 + Math.random() * (6 - 3 + 1));
		int numeros[][] = new int[numAle][numAle];
		int sumaDiag = 0;
		for(int i = 0; i < numeros.length; i++) {
			
			for(int j = 0; j< numeros[i].length; j++) {
				
				
				numeros[i][j] = (int) (0 + Math.random() * (100 - 0 + 1));
				
				
			System.out.print(numeros[i][j] + "\t");	
			}
			
			System.out.println(" ");
			
			sumaDiag += numeros[i][i];
		}
		
		System.out.println("Suma Diagonal: " + sumaDiag);
		
	}
	
	
}

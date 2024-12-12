package Ud7ejercicios4.Arrays;

public class Ejercicio5_Camara_Seguridad {
	public static void main(String[] args) {
	
		int numero[][] = new int[2][3];
		int numero2[][] = new int[3][2];
		
		for(int i = 0; i< numero.length; i++) {
			
			for(int j =0; j< numero[i].length; j++) {
				
				numero[i][j] = (int) (0 + Math.random() * (10 - 0 + 1));
				System.out.print(numero[i][j] + "\t");
				
			}
			System.out.println(" ");
		}
		
		System.out.println("------");
		
		for(int i = 0; i< numero2.length; i++) {
			
			for(int j =0; j< numero2[i].length; j++) {
				
				numero2[i][j] = (int) (0 + Math.random() * (10 - 0 + 1));
				System.out.print(numero2[i][j] + "\t");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("------");
			for(int i = 0; i< numero.length; i++) {
			
				for(int j =0; j< numero[i].length; j++) {
				
				numero[i][j] = numero[i][j] * numero2[j][i];
				System.out.print(numero[i][j] + "\t");
			}
			System.out.println(" ");
		}
}
}

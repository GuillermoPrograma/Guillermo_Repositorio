package Ud7.Ejercicio3Multidimensionales;

public class Ejercicio2_Del1al10 {

	public static void main(String[] args) {
		int Numeros[][] = new int[10][10];
		
		for(int i =0; i< Numeros.length;i++) 
		{
			for(int j = 0; j< Numeros[i].length; j++) {
				
				Numeros[i][j] = (i+1)*(j+1);
				
			}
			
		}
		
		for(int i =0; i< Numeros.length;i++) 
		{
			for(int j = 0; j< Numeros[i].length; j++) {
			System.out.print(Numeros[i][j] + "\t");
				
			}
			System.out.println(" ");
		}
		
	}
	
	
}

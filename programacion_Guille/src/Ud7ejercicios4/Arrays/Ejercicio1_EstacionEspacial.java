package Ud7ejercicios4.Arrays;

public class Ejercicio1_EstacionEspacial {

	public static void main(String[] args) {
		
		int numAle = (int) (1 + Math.random() * (15 - 1 + 1));
		
		int	valores[] = new int [numAle];
		int promedio = 0;
		int contMin = 0;
		int contMax = 0;
		
		
		for(int i = 0; i< valores.length;i++) {
			
			valores[i] =(int) (1 + Math.random() * (100 - 1 + 1));
		
			 promedio += valores[i]/valores.length;
		}
		
		for(int i = 0; i< valores.length;i++){
			
			if(valores[i] < promedio) 
			{
				
			contMin++;
				
			}
			if(valores[i] > promedio) {
				
				contMax++;
			}
			
		}
		System.out.println("Promedio " + promedio);
		System.out.println("Minimos " + contMin);
		System.out.println("Máximos " + contMax);
		
	}
	
	
}

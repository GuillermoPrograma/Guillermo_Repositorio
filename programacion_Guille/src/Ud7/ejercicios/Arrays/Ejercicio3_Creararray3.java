package Ud7.ejercicios.Arrays;

public class Ejercicio3_Creararray3 {
public static void main(String[] args) {
	
	
	//array 1
	
	int Array[] = new int [10];
	for(int i = 0; i<Array.length;i++) 
	{
	
		
		Array[i] = 100 + i;
		
	}
	
	//array 2
	
	int Array2[] = new int [20];
	
	
	for(int i = 0; i < Array2.length; i++) {
		if(i == 4|| i==5 || i == 6 || i == 7) 
		{
			Array2[i] = 99;
		}
		else 
		{	
			Array2[i] = Array2.length - i;
		}
		
		
	}
	
	//array 3
	
	int Array3[] = new int [30];
	

	for(int i = 0; i < Array2.length; i++) {
		
		Array3[i] = Array2[i];
		
		
	
}
	for(int i =Array2.length ; i<(Array3.length);i++) 
	{
		
		Array3[i] = Array[(i-Array2.length)];
		
	}
	
	
	//Ejercicio 4
	for(int i =0 ; i<(Array3.length);i++) 
	{
		if(i == 5) 
		{
			
			System.out.println("La posicion del 5 es "  + Array3[i]) ;
			
		}
		
	}
	
	//Ejercicio6
	for(int i = 2; i<8;i++) {
	
	Array[i] = Array2[i-2];	
		
	}
	
	//Ejercicio 7
	System.out.println("Array1");
	for(int i = 0; i<Array.length;i++) 
	{
		System.out.print( Array[i] + " ");
		
	}
	System.out.println();
	System.out.println("Array2");
	for(int i = 0; i<Array2.length;i++) 
	{
		System.out.print( Array2[i] + " ");
		
	}
	System.out.println();
	System.out.println("Array3");
	for(int i = 0; i<Array3.length;i++) 
	{
		System.out.print(Array3[i] + " ");
		
	}
}	
	
}

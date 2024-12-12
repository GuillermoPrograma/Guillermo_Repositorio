package Ud4.ejercicios.bucles2;

import java.util.Scanner;

public class Ejercicio7_ContarNumEntreMayoryMenor {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Dime un Número : ");
	int numPeq = entrada.nextInt();
	
	int numPar = 0;
	
	System.out.print("Dime otro Num más grande:");
	int numMax = entrada.nextInt();	
	if(numMax < numPeq){
		System.out.println("Error, dame Num mas grande");
		numMax = entrada.nextInt();		
	}
	
	int rango = numMax - numPeq;
	
		for(int i = 0; i <=(rango);i++){
		
		if(numPeq % 2 == 0) 
		{
			numPar++;		
		}	
			
			
			
			System.out.print(numPeq + " ");
		numPeq++;
		
		
	}
	System.out.println("Hay "+ numPar +" NumerosPares");
}
}

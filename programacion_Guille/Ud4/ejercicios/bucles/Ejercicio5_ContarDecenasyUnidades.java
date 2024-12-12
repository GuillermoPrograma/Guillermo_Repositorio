package Ud4.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio5_ContarDecenasyUnidades {

	public static void main(String[] args) {
		
		System.out.println("Pon número");
		Scanner entrada = new Scanner(System.in);
		
		boolean bucle = true;
		
		
		while (bucle == true) {
			int numeroElegido = entrada.nextInt();
			
			if(numeroElegido>99 ||  numeroElegido<9 ) {
	
				System.out.println("Tienen que ser dos cifras");
				
				
				} else {
				
				int numeroDecenas = numeroElegido / 10;
				int numeroUnidades = numeroElegido % 10;
				
				System.out.println("Numero decenas " + numeroDecenas);
				System.out.println("Numero unidades " + numeroUnidades);
				
				entrada.close();
				bucle = false;
				}
			}
	
		}
	
	}
	


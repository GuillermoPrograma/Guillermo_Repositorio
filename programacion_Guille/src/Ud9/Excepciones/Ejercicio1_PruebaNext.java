package Ud9.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1_PruebaNext {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		try {
			int nums = entrada.nextInt();
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Solo puede ser valor ");
			
		}
	}

}

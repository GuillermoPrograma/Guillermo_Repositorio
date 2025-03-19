package Ud9.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3_BucleExcepcion {
public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	int p = (int) (0 + Math.random() * (100 - 0 + 1));
	double prueba[] = new double [p];
	try 
	{
		for(int i = 0; i < prueba.length; i++) 
		{
			
			prueba[i] = (1 + Math.random() * (10 - 1 + 1));
		}
		int num = entrada.nextInt();
		while(num >= 0) 
		{
			System.out.println(prueba[num]);
			num = entrada.nextInt();
		}
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Mas pequenio el numero");
	}
	catch(InputMismatchException e)
	{
		System.out.println("que sea un número");
	}
}

}
